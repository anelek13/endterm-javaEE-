package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RoomController {

	private RoomService roomService;

	public String roomList(Model theModel) {
		
		List <Room> vacantRooms = roomService.getVacantRooms();
		theModel.addAttribute("roomList", vacantRooms);
		return "roomList";
		
	}

	public String occupiedRoomList(Model theModel) {
		
		List <Room> occupiedRooms = roomService.getOccupiedRooms();
		theModel.addAttribute("roomList", occupiedRooms);
		return "occupiedRoomList";
		
	}
	

	public String checkoutRoom (@RequestParam("roomId") Integer theRoomId) {
		System.out.println("I am mapped!!!");
		Room theRoom = roomService.getRoomById(theRoomId);
		List<Guest> occupants = theRoom.getOccupants();
		LocalDate localDate = LocalDate.now();
		localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		for(Guest guest : occupants) {
			System.out.println(guest.getFirstName());
			guest.setCheckedout(true);
			guest.setCheckoutDate(localDate);
			theRoom.setOccupants(null);
			theRoom.setOccupied(false);

		}
		roomService.saveUpdateRoom(theRoom);
		return "redirect:/room/occupiedRoomlist";
	}
	
}

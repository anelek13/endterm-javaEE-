package controller.converters;

public class StringToRoomConverter implements  Converter<String,Room>{

	GuestService guestService;
	@Override
	public Room convert(String id) {
		 Room room = guestService.getRoomById(Integer.parseInt(id));
		 return room;
	}

}

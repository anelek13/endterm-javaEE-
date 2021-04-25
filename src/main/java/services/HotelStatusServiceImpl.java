package services;

import java.util.List;

import DAO.RoomDAO;
import entity.Guest;
import entity.Room;



@Service
public class HotelStatusServiceImpl implements HotelStatusService{
	
	private RoomDAO roomDAO;

	@Override
	public List<Room> getAllRooms() {
		return roomDAO.getAllRooms();
	}

	@Override
	public List<Guest> getActualGuests() {
		return null;
	}


}

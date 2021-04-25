package services;

import entity.Guest;
import entity.Room;

import java.util.List;



public interface HotelStatusService {META-INF
	
	public List<Room> getAllRooms();
	public List<Guest> getActualGuests();
}

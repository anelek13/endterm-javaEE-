package services;

import entity.Room;

import java.util.List;



public interface RoomService {

	public Room getRoomById(int id) ;
	public List<Room> getVacantRooms ();

	public List<Room> getOccupiedRooms ();

	void saveUpdateRoom(Room theRoom);
}

package DAO;

import java.util.List;

import entity.Room;

public interface RoomDAO {


	public List<Room> getAllRooms();

	public List<Room> getVacantRooms();

	public Room getRoomById(int id);
	public void saveUpdateRoom(Room room);
	public List<Room> getOccupiedRooms();

}

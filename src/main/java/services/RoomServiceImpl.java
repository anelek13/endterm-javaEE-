package services;

import DAO.RoomDAO;
import entity.Room;

import java.util.List;



@Service
public class RoomServiceImpl implements RoomService {

	private RoomDAO roomDAO;

	@Override
	public Room getRoomById(int id) {
		return roomDAO.getRoomById(id);
	}


	@Override
	public List<Room> getVacantRooms() {
		return roomDAO.getVacantRooms();
	}

	/**
	 * @see RoomDAO
	 */
	@Override
	public List<Room> getOccupiedRooms() {
		return roomDAO.getOccupiedRooms();
	}

	/**
	 * @see RoomDAO
	 */
	@Override
	public void saveUpdateRoom(Room theRoom) {
		roomDAO.saveUpdateRoom(theRoom);
		
	}

}

package DAO;
import entity.Guest;

import java.util.List;


interface uestDAO {

	public List<Guest> getActualGuests();

	public List<Guest> getCheckedoutGuests();

	public void saveUpdateGuest(Guest theGuest);
	public Guest getGuestById(int id);

	public List<Guest> getCommingCheckouts();
}

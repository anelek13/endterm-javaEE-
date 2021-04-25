package services;

import java.util.List;


import DAO.LoginDAO;
import entity.User;


@Service
public class AdministrationServiceImpl implements AdministrationService{
	private LoginDAO loginDAO;
	;

	@Override
	public List<User> getAllUsers() {
		return loginDAO.getAllUsers();
	}

	@Override
	public void registerUser(User user) {
		loginDAO.saveOrUpdateUser(user);
		
	}

	@Override
	public void deleteUser(int id) {
		loginDAO.deleteUser(id);
		
	}

	@Override
	public User getUser(int id) {
		return loginDAO.getUser(id);
	}

}

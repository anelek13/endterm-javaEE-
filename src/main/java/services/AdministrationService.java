package services;

import entity.User;

import java.util.List;


public interface AdministrationService {

	public List<User> getAllUsers();

	public void registerUser(User user);

	public void deleteUser(int id);

	public User getUser(int id);
}

package DAO;

import java.util.List;

import entity.User;

public interface LoginDAO {

	public User getUser(String login);

	public List<User> getAllUsers();


	public void saveOrUpdateUser(User user);

	public void deleteUser(int id);

	public User getUser(int id);
}

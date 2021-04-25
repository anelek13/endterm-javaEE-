package services;


import DAO.LoginDAO;
import entity.User;

@Service
public class LoginServiceImpl implements LoginService {
	
	private LoginDAO loginDAO;
	

	@Override
	public User getUser(String login) {
		return loginDAO.getUser(login);
	}

	@Override
	public User loginUser(String login, String password) {
		User user = null;
		

		
		if(user != null && user.getPassword().equals(password)) {
			return user;
		}
		
		return null;
	}

}

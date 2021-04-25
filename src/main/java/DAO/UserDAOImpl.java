/*package DAO;


import java.util.List;


import entity.User;

import javax.management.Query;

public class UserDAOImpl implements LoginDAO{

	private SessionFactory sessionFactory;
	
	@Override
	public User getUser(String login) {
		Session session = sessionFactory.getCurrentSession();
		User theUser = null;
		Query query = session.createQuery("select u from User u where u.login =:login", User.class);
		query.setParameter("login", login);
		theUser = (User) query.getSingleResult();
		return theUser;
	}
	
	@Override
	public List<User> getAllUsers() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User", User.class);
		List<User> userList = query.getResultList();
		return userList;
	}

	@Override
	public void saveOrUpdateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

	@Override
	public void deleteUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from User where id=:userId");
		query.setParameter("userId", id);	
		query.executeUpdate();

	}
	
	@Override
	public User getUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, id);
		return user;

	}

}
*/
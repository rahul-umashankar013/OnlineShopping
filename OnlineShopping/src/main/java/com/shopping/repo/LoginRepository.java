package com.shopping.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shopping.dto.User;
import com.shopping.util.MySessionFactory;

public class LoginRepository implements ILoginRepository {
    SessionFactory sf=MySessionFactory.getFactory();

	public User addUser(User user) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        return user;
	}

	public User removeUser(User user) {
		Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
      ses.delete(ses.load(User.class, user.getId())); 
         tx.commit();
       
        return user; // Return the removed user
	}

	public User validateUser(User user) {
		Session ses=sf.openSession();
		User u2=null;
		
		try{
			
			u2=(User) ses.createQuery("From User where username=:u1").setParameter("u1",user.getUsername()).uniqueResult();
			
			
		}
		catch(Exception E)
		{
			
			E.printStackTrace();
			
		}
		
		return u2;
	}

	public User signOut(User user) {
		 System.out.println(user.getUsername() + " has signed out.");
	        return user; // Return the user who signed out
	}
}

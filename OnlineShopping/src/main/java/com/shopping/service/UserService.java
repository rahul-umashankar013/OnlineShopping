package com.shopping.service;

import com.shopping.dto.User;
import com.shopping.repo.ILoginRepository;
import com.shopping.repo.LoginRepository;

public class UserService {
      ILoginRepository repo=new LoginRepository();
      public User AddUser(User u)
      {
    	  if(repo.validateUser(u)==null)
    	  {
    		  System.out.println("User name available");
    		  User ans=repo.addUser(u);
    		  return ans;
    	  }
    	  else
    	  {
    		  System.out.println("Username already exists");
    		  return null;
    	  }
      }
      
      
      
      public User validateUser(User u)
      {
    	  return repo.validateUser(u);
      }
      
      public User removeUser(User u) {
          User existingUser = repo.validateUser(u);
          if (existingUser != null) {
              repo.removeUser(existingUser); // Remove the existing user
              System.out.println("User " + u.getUsername() + " removed successfully.");
              return existingUser;
          } else {
              System.out.println("User does not exist.");
              return null; // User not found
          }
      }

      public User signOut(User u) {
          return repo.signOut(u);
      }
  
      
}

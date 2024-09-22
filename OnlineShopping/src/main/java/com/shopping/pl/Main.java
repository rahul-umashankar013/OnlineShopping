package com.shopping.pl;
import java.util.*;
import com.shopping.dto.User;
import com.shopping.service.UserService;

public class Main {
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
    	UserService serv=new UserService();
    	  System.out.println("Welcome to Online Shopping");
          System.out.println("Add User");

          System.out.print("Enter username: ");
          String username = sc.nextLine();
          System.out.print("Enter password: ");
          String password = sc.nextLine();
          System.out.print("Enter email: ");
          String email = sc.nextLine();

          User user = new User(username, password, email);
          serv.AddUser(user);
    	
          System.out.println("Remove User");
          System.out.print("Enter username to remove: ");
          String removeUsername = sc.nextLine();
          User userToRemove = new User(removeUsername, null, null); // Create user with just username
          serv.removeUser(userToRemove); // Attempt to remove user
              
          System.out.println("Sign Out");
          System.out.print("Enter username to sign out: ");
          String signOutUsername = sc.nextLine();
          User userToSignOut = new User(signOutUsername, null, null); // Create user with just username
          serv.signOut(userToSignOut); // Attempt to sign out user
          

    	
    }
}

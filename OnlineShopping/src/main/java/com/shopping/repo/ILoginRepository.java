package com.shopping.repo;

import com.shopping.dto.User;

public interface ILoginRepository {
	public User addUser(User user);
	public User removeUser(User user);
    
	public User validateUser(User user);
	public User signOut(User user);

}

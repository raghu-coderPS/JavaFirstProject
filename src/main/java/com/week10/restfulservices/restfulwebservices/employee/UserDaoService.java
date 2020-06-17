package com.week10.restfulservices.restfulwebservices.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<UserPOJO> users=new ArrayList<>();
	private static int usersCount=3;
	
	static {
		users.add(new UserPOJO(1,"Raghu",new Date()));
		users.add(new UserPOJO(2,"Mithun",new Date()));
		users.add(new UserPOJO(3,"Manoj",new Date()));
	}
	public List<UserPOJO> findAll()
	{
		return users;
		
	}
	public UserPOJO save(UserPOJO user)
	{
		if(user.getId()==null)
		{
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public UserPOJO findOneUsingId(int id)
	{
		for(UserPOJO user:users)
		{
			if(user.getId()==id)
				return user;
		}
		return null;
	}
	public UserPOJO deleteUsingId(int id)
	{
		Iterator<UserPOJO> iterator =users.iterator();
		while(iterator.hasNext())
		{
			UserPOJO user=iterator.next();
			if(user.getId()==id)
			{
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}

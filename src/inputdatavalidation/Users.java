package inputdatavalidation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Users {
	
	private HashMap demoUsers;
	
	public Users() {
		
		//Add some demo users
		demoUsers = new HashMap<String, String>();
		demoUsers.put("John", "password");
		demoUsers.put("Jill", "1234567");
	}
	
	public boolean registerUser(String username, String password) {
		
		boolean userRegistered = false;
		
		//Perform some initial validation
		if(username.length() <= 1 || password.length() <= 1) {
			
			userRegistered = false;
			System.out.println("Invalid inputs provided");
			
		} else {
			
			demoUsers.put(username, password);
			userRegistered = true;
			
		}
		
		
		return userRegistered;
		
	}
	
	public String getUserList() {
		
		String list = "";
		
		Set set = demoUsers.entrySet();
		
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry en = (Map.Entry)i.next();
			list += en.getKey() + " : ";
		}
		
		return list;
	}
	
	
}

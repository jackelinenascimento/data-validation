package inputdatavalidation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users users = new Users();
		
		System.out.println(users.getUserList());
		
		users.registerUser("a", "a");
		users.registerUser("b", "b");
		users.registerUser("c", "c");
		users.registerUser("d", "d");
		
		System.out.println(users.getUserList());
	}

}

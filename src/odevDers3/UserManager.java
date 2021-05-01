package odevDers3;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirstName() + " isimli kullanýcý sisteme eklendi.");
	}
	
	public void remove(User user) {
		
		System.out.println(user.getFirstName() + " isimli kullanýcý sistemden çýkarýldý. ");
	}

}

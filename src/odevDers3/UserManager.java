package odevDers3;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirstName() + " isimli kullan�c� sisteme eklendi.");
	}
	
	public void remove(User user) {
		
		System.out.println(user.getFirstName() + " isimli kullan�c� sistemden ��kar�ld�. ");
	}

}

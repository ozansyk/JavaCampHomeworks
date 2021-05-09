package javaCampHw3_2;

public class UserManager {
	public void login(User user) {
		System.out.println("Giriþ yapýldý: " + user.getFirstName());
	}
	
	public void logout(User user) {
		System.out.println("Çýkýþ yapýldý: " + user.getFirstName());
	}
}

package javaCampHw3_2;

public class UserManager {
	public void login(User user) {
		System.out.println("Giri� yap�ld�: " + user.getFirstName());
	}
	
	public void logout(User user) {
		System.out.println("��k�� yap�ld�: " + user.getFirstName());
	}
}

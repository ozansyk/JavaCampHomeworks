package javaCampHw3_2;

public class StudentManager extends UserManager {
	public void enrollCourse(User student) {
		System.out.println("Kursa kaydolundu: " + student.getFirstName());
	}
	
	public void leaveCourse(User student) {
		System.out.println("Kurs bırakıldı: " + student.getFirstName());
	}
}

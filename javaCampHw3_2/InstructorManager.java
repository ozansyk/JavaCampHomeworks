package javaCampHw3_2;

public class InstructorManager extends UserManager {
	public void addNewCourse(User instructor) {
		System.out.println("Yeni kurs bu hoca tarafından eklendi: " + instructor.getFirstName());
	}
	
	public void deleteCourse(User instructor) {
		System.out.println("Kurs bu hoca tarafından silindi: "+ instructor.getFirstName());
	}
}

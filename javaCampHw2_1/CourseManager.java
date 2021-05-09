package javaCampHw2_1;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs eklendi: " + course.name);
	}
	
	public void delete(Course course) {
		System.out.println("Kurs silindi: " + course.name);
	}

}

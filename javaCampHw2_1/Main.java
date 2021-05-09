package javaCampHw2_1;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin Demirog");
		Instructor instructor2 = new Instructor(2, "Ozan Soyak");
		
		Course course1 = new Course(1, 1, "Java");
		Course course2 = new Course(2, 2, "Html");
		
		Course[] courses = {course1, course2};
		Instructor[] instructors = {instructor1, instructor2};
		
		for(Course course : courses) {
			System.out.println(course.name + " ");
		}
		for(Instructor instructor : instructors) {
			System.out.println(instructor.name + " ");
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);

	}

}

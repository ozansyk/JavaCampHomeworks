package javaCampHw3_2;

public class Main {

	public static void main(String[] args) {
		
		User student1 = new Student("1", "Ozan", "Soyak", "ozan.soyak@hotmail.com", "123456", 70);
		User student2 = new Student("2", "Onur", "Soyak", "onur.soyak@hotmail.com", "987654", 65);
		
		User instructor1 = new Instructor("1", "Engin", "Demirog", "engindemirog@gmail.com", "1234567", 3);
		
		StudentManager userManager1 = new StudentManager();
		InstructorManager userManager2 = new InstructorManager();
		
		userManager1.enrollCourse(student1);
		userManager1.leaveCourse(student1);
		
		userManager1.enrollCourse(student2);
		userManager1.leaveCourse(student2);
		
		userManager2.addNewCourse(instructor1);
		userManager2.deleteCourse(instructor1);
		
	}

}

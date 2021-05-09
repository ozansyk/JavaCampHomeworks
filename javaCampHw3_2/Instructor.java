package javaCampHw3_2;

public class Instructor extends User {
	
	int addedCourseCount;

	public Instructor(String id, String firstName, String lastName, String eMail, String password, int addedCourseCount) {
		super(id, firstName, lastName, eMail, password);
		this.addedCourseCount = addedCourseCount;
	}

	public int getAddedCourseCount() {
		return addedCourseCount;
	}

	public void setAddedCourseCount(int addedCourseCount) {
		this.addedCourseCount = addedCourseCount;
	}
	
}

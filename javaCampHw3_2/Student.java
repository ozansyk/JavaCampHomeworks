package javaCampHw3_2;

public class Student extends User {
	
	int completeRate;

	public Student(String id, String firstName, String lastName, String eMail, String password, int completeRate) {
		super(id, firstName, lastName, eMail, password);
		this.completeRate = completeRate;
	}

	public int getCompleteRate() {
		return completeRate;
	}

	public void setCompleteRate(int completeRate) {
		this.completeRate = completeRate;
	}
	
}

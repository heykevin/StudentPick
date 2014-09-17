package cs.ualberta.ca.studentpick;

public class Student {
	protected String studentName;
	
	public Student(String studentName) {
		this.studentName = studentName;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.studentName;
	}
	public String toString(){
		return getName();
	}

}

package cs.ualberta.ca.studentpick;

public class StudentListController {
	// lazy singleton
	private static StudentList studentList = null;

	static public StudentList getStudentList() {
		if (studentList == null) {
			studentList = new StudentList();
		}
		return studentList;

	}

	public Student chooseStudent() throws EmptyStudentListException {
		return getStudentList().chooseStudent();
	}

	public void addStudent(Student student) {
		getStudentList().addStudent(student);
	}

	public void bulkImport(String text) {
		//getting an array of strings from bulk import
		String [] lines = text.split("\n");
		StudentList sl = getStudentList();
		for (int i = 0; i <lines.length; i++){
			//if lines are not blank
			String line = lines[i].trim();
			if (!lines.equals("")){
				Student s = new Student(line);
				sl.addStudent(s);
				
			}
		}
	}
}

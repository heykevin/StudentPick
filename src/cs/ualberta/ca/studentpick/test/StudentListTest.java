package cs.ualberta.ca.studentpick.test;

import java.util.Collection;

import cs.ualberta.ca.studentpick.Student;
import cs.ualberta.ca.studentpick.StudentList;
import junit.framework.TestCase;

public class StudentListTest extends TestCase {
	public void testEmptyStudentList() {
		// checking if list is empty - create list do nothing
		StudentList studentList = new StudentList();
		Collection<Student> students = studentList.getStudents();
		assertTrue("Empty Student List", students.size() == 0);
	}

	public void testAddStudentList() {
		// add one student - check if student is added
		StudentList studentList = new StudentList();
		String studentName = "A STudent";
		Student testStudent = new Student(studentName);
		Collection<Student> students = studentList.getStudents();
		studentList.addStudent(testStudent);
		assertTrue(" Student List Size = 1", students.size() == 1);
		assertTrue("Test student not contained", students.contains(testStudent));
	}

	public void testRemoveStudentList() {
		StudentList studentList = new StudentList();
		String studentName = "A STudent";
		Student testStudent = new Student(studentName);
		studentList.addStudent(testStudent);
		Collection<Student> students = studentList.getStudents();
		assertTrue(" Student List Size = 1", students.size() == 1);
		assertTrue("Test student not contained", students.contains(testStudent));
		// removing student to check if list is empty
		studentList.removeStudent(testStudent);
		students = studentList.getStudents();
		assertTrue(" Student List Size isnt small enough", students.size() == 0);
		assertFalse("Test student still contained",
				students.contains(testStudent));

	}

	public void testChooseStudentList() {
		// add one student - check if student is added
		StudentList studentList = new StudentList();
		String studentName = "A STudent";
		Student testStudent = new Student(studentName);
		studentList.addStudent(testStudent);

		for (int i = 0; i < 10; i++) {
			Student student = studentList.chooseStudent();
			assertTrue("Student is not null", student != null);
			assertTrue("Didn't choose right student",
					student.equals(testStudent));
		}
		String studentNameB = "Bstudent";
		Student testStudentB = new Student(studentNameB);
		studentList.addStudent(testStudentB);
		Student[] studentArray = { testStudent, testStudentB };
		for (int i = 0; i < studentArray.length; i++) {
			Student targetStudent = studentArray[i];
			int maxcount = 1000;
			while (maxcount > 0 && !targetStudent.equals(studentList.chooseStudent())) {
				// do nothing;
				maxcount--;
			}
			assertTrue("Too Many iterations", maxcount > 0);
		}

	}

}

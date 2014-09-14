package cs.ualberta.ca.studentpick.test;

import java.util.Collection;

import cs.ualberta.ca.studentpick.Student;
import cs.ualberta.ca.studentpick.StudentList;
import junit.framework.TestCase;

public class StudentListTest extends TestCase {
	public void testEmptyStudentList() {
		StudentList studentList = new StudentList();
		Collection<Student> students = studentList.getStudents();
		assertTrue("Empty Student List", students.size() == 0);
	}

	public void testAddStudentList() {
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
		studentList.removeStudent(testStudent);
		students = studentList.getStudents();
		assertTrue(" Student List Size isnt small enough", students.size() == 0);
		assertFalse("Test student still contained", students.contains(testStudent));

	}

}

package cs.ualberta.ca.studentpick.test;

import junit.framework.TestCase;
import cs.ualberta.ca.studentpick.Student;
public class StudentTest extends TestCase {
	public void testStudent(){
		String studentName = "A Student";
		Student student = new Student(studentName);
		assertTrue("Student Name is not equal", studentName.equals(student.getName()));
	}

}

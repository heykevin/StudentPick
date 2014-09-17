package cs.ualberta.ca.studentpick;

import java.util.ArrayList;
import java.util.Collection;

public class StudentList {
	protected ArrayList<Student> studentList;
	protected ArrayList<Listener> listeners;

	public StudentList() {
		studentList = new ArrayList<Student>();
		listeners = new ArrayList<Listener>();
	}

	public Collection<Student> getStudents() {

		return studentList;
	}

	public void addStudent(Student testStudent) {
		studentList.add(testStudent);
		//when adding student  notify everything is changed
		notifyListeners();

	}

	public void removeStudent(Student testStudent) {
		studentList.remove(testStudent);
	}

	public Student chooseStudent() throws EmptyStudentListException {
		int size = studentList.size();
		if (size <= 0){
			throw new EmptyStudentListException();
		}
		int index = (int) (studentList.size() * Math.random());
		return studentList.get(index);
	}

	public int size() {
		// TODO Auto-generated method stub
		return studentList.size();
	}

	public boolean contains(Student testStudent) {
		// TODO Auto-generated method stub
		return studentList.contains(testStudent);
	}
	public void notifyListeners(){
		for (Listener listener : listeners){
			listener.update();
		}
		
	}
	public void addListener (Listener L){
		listeners.add(L);
	}
	public void removeListener(Listener l){
		listeners.remove(l);
	}
	
}
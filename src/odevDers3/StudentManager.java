package odevDers3;

public class StudentManager {
	
	public void courseTaken(Student student , Course course) {
		System.out.println(student.getFirstName() + " isimli ��renci " + course.getCourseName() + " dersini ald�.");
	}
	
	public void courseDrop(Student student , Course course){
		System.out.println(student.getFirstName() + " isimli ��renci " + course.getCourseName() + " dersini b�rakt�.");
	}
}

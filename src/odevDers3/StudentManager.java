package odevDers3;

public class StudentManager {
	
	public void courseTaken(Student student , Course course) {
		System.out.println(student.getFirstName() + " isimli öğrenci " + course.getCourseName() + " dersini aldı.");
	}
	
	public void courseDrop(Student student , Course course){
		System.out.println(student.getFirstName() + " isimli öğrenci " + course.getCourseName() + " dersini bıraktı.");
	}
}

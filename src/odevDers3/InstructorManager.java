package odevDers3;

public class InstructorManager {
	
	public void courseGiven(Instructor instructor , Course course) {
		
		System.out.println(instructor.getFirstName() + " isimli ��retmen " + course.getCourseName() + " dersi veriyor.");
	}
	
	
	public void courseDrop(Instructor instructor , Course course) {
		
		System.out.println(instructor.getFirstName() + " isimli ��retmen " + course.getCourseName() + " dersini b�rakt�.");
	}

}

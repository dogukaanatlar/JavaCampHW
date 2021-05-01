package odevDers3;

public class CourseManager {
	
	public void add(Course course) {
		
		System.out.println(course.getCourseName() + " eklendi.");
	}
	
	public void addMultiple(Course[] courses) {
		
		for (Course course : courses) {
			
			System.out.println(course.getCourseName() + " eklendi.");
		}
	}
	
	public void remove(Course course) {
		
		System.out.println(course.getCourseName() + " çıkarıldı.");
	}

}

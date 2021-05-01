package odevDers3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Dogukaan");
		student.setLastName("Atlar");
		student.setEmailAddress("dogukaanatlar@gmail.com");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		
		Course java = new Course(1, "Java");
		Course cpp = new Course(2, "C++");
		
		Course[] courses = { java , cpp};
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(java);
		courseManager.remove(cpp);
		courseManager.addMultiple(courses);
		
		StudentManager studentManager = new StudentManager();
		studentManager.courseTaken(student, java);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.courseGiven(instructor, java);
		
		

	}

}

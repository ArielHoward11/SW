package SRP;

public class SRPExample {

	public static void main(String[] args) {
		Course course = new Course();
		Grade grade = new Grade();
		
		course.courseRegistration();
		course.checkSchedule();
		course.checkCourse();
		
		grade.inputGrade();
		grade.checkGrade();
		grade.checkTotalGrade();
	}

}

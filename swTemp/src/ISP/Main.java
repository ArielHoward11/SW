package ISP;

public class Main {
	public static void main(String args[]) {
		AcademicAdministration administration = new AcademicAdministration();

		administration.SetcheckGrade();
		administration.SetCourseRegistration();

		administration.checkGrade();
		administration.courseRegistration();

		administration.inputGrade();
		administration.checkAttendance();

	}
}

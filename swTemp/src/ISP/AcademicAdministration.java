package ISP;

public class AcademicAdministration implements Course, Employee, Student {
	public void courseRegistration() {
		System.out.println("학생:수강신청 메소드");
	}
	public void checkGrade() {
		System.out.println("학생:성적조회 메소드");
	}
	public void SetCourseRegistration() {
		System.out.println("직원:수강신청기간설정 메소드");

	}
	public void SetcheckGrade() {
		System.out.println("직원:성적조회기간설정 메소드");
	}
	public void inputGrade() {
		System.out.println("교수:성적입력 메소드");

	}
	public void checkAttendance() {
		System.out.println("교수:출석부조회 메소드");

	}
}

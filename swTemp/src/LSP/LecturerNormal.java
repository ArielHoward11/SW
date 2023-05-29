package LSP;

public class LecturerNormal extends Lecturer {
	public LecturerNormal() {
		lecturer = "일반 강사";
	}

	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료 :" + charge + "원 \n");
	}
}
package chapter07.step7.q14;

public class StudentTest {

	public static void main(String[] args) {
		UnderGraduate std1 = new UnderGraduate("sojin", "business", 4, 4.5, "movementary"); 
		Graduate std2 = new Graduate("kim", "history", 1, 4.0, "교육 조교", 0.5);
		
		System.out.println(std1);
		System.out.println(std2);
	}

}

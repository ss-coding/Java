package j001;

public class ClassRoom {
	public static void main(String[] args) {
//		Student Sean = new Student();
//		Sean.setGrade(5);
//		Sean.setGender("Boy");
//		
//		Student Grace = new Student();
//		Grace.setGrade(3);
//		Grace.setGender("Girl");
		
		Student Sean = new Student(5, "Boy");
		Student Grace = new Student(3, "Girl");
		
		System.out.printf("Sean is "+Sean.getGrade()+" Grade student.");
		System.out.print(Sean.getGender());
		
	}
}

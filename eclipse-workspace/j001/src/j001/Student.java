package j001;

public class Student {
	private int grade;
	private String gender;
	
	public  Student(int a, String b) {
		setGrade(a);
		setGender(b);
	}
	
	public void setGrade(int a) {grade=a;}
	public int getGrade() {return grade;}
	
	public void setGender(String b) {gender=b;}
	public String getGender() {return gender;}
		
}

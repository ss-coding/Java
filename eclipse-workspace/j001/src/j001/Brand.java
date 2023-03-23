package j001;

public class Brand {
	
	public void brand() {
		System.out.print("Mis Wang's car is Toyota, ");
		drivetime(5);
		System.out.printf("and she is %d years old.",olds(1999));
	}
	
	public void drivetime(int year) {
		System.out.printf("she already drived for %d years, ",year);
	}
	
	public int olds(int years) {
		return 2023-years;
	}
	
}
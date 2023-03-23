package j001;

public class ATM {
	private int money=0;
	
	public void setMoney(int a) {money = a;}
	
	public int getMoney() {return money;}
	
	public void save(int a) {
		if(a<0) {System.out.print("Can not be negative number!!\n");}
		else money += a;
	}
	
	public void withdraw(int a) {
		if(a<0) {System.out.print("Can not be negative number!!\n");}
		else if(money<a) {System.out.print("Your account balance is insufficient.\n");}
		else money -= a;
	}
	
}

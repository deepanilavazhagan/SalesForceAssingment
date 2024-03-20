package assingment;

public class AxisBank extends BankInfo {
	public void deposite() {
		System.out.println("Overriden Deposite");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposite();
		a.Saving();
		
	}
	

}

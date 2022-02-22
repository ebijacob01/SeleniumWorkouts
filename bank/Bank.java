package bank;

public class Bank extends SBI implements CIBIL,PNB{

	@Override
	public void bankBalance() {
		System.out.println("1,00,000");
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("2,00,000");
		
	}

	public void creditScore() {
		System.out.println("800");
		
	}

	public void minimumBalance() {
		System.out.println("1000");
		
	}

	public void cibilScore() {
	    System.out.println("8");
		
	}
	public static void main(String[] args) {
		Bank type=new Bank();
		type.bankBalance();
		type.maximumLoanAmount();
		type.creditScore();
		type.minimumBalance();
		type.cibilScore();
		type.ItLoan();
	}
	

}

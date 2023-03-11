package oopsday3.atm.menu;

public interface BankingIface2 {
	
	public abstract double withdraw (double amount, int actno);
	public abstract double  deposit(double amount, int actnot);
	public abstract double balanceEnquiry (int actno);
	

}

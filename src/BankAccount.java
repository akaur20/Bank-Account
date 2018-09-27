
public class BankAccount 
{
	private String name;
	private double accNum;
	private double balance;
	
	public BankAccount(String accName, double accNumber)
	{
		name = accName;
		accNum = accNumber;
		balance = 0;
	}
	
	public BankAccount(String accName, double accNumber, double accBalance)
	{
		name = accName;
		accNum = accNumber;
		balance = accBalance;
			
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
	
}


public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount(String accName, int accNumber)
	{
		name = accName;
		accNum = accNumber;
		balance = 0;
	}
	
	public BankAccount(String accName, int accNumber, double accBalance)
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
	
	public String toString()
	{	
		return "name:" +  name + "\tbalance:" + balance + "\taccNum:" + accNum;
	}
	
}

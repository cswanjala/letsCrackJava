public class Account {
	//fields
	private String name;
	private String account_number;
	private double balance;

	public Account(String name,String acount_number,double balance)
	{
		this.name = name;
		this.account_number=account_number;
		this.balance=balance;
	}

	public String getName()
	{
		return this.name;
	}

	public String getAccountNumber()
	{
		return this.account_number;
	}

	public double getBalance()
	{
		return this.balance;
	}


}
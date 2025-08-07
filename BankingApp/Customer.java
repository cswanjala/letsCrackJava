public class Customer
{
	private String name;
	private String location;
	private Account account;

	public Customer(String name,String location,Account account)
	{
		this.name = name;
		this.location = location;
		this.account = account;
	}

	public String toString()
	{
		String output = "Customer =="+this.name+" comes from "+this.location + " and is worth $ "+this.account.getBalance();
		return output;
	}



}

public class Main {
	public static void main(String[] args) {

		Account churchil_account = new Account("Rich account","1234-5678-0101-8878",900000000.00);
		Account kenya_account = new Account("Kenya account","127-5678-0101-8457",768696968699.06);
		Customer churchil = new Customer("Churchil","Nairobi",churchil_account);
		Customer kenya = new Customer("Kenya","Africa",kenya_account);
		System.out.println(kenya);

		//Churchil should be in a position to send money to kenya and vice-versa
		//once you send money ,your bank account balance should reduce by the amount of money you just sent
		//and the account balance of your receiver should increase by the amount they just received
		
	}
}
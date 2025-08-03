

class Test 
{
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		int maths = 90;
		int english = 87;
		int kiswahili = 98;
		int science =85;
		int sst = 90;
		
		int total = maths+english+kiswahili+science+sst;
		
		//System.out.println("The total is ="+total);
		//System.out.println("The grade is = "+getGrade(total));
		//test our modularized code
		printMyData("The total of test is",total);
		printMyData("The Grade is ",'T');
		
	}
	
	public static char getGrade(int total)
	{
		char grade ;
		float average = total / 5;
		if (average >= 90 ) grade = 'A';
		else if (average >= 50) grade = 'B';
		else grade = 'D';
		
		return grade;
	}
	
	public static void printMyData(String statement,int data)
	{
		
		System.out.println(statement+data);
	}
}
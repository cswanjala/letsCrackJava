

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
		
		String[] subjects = {"maths","english","kiswahili","science","sst"};
		int[] scores = {maths,english,kiswahili,science,sst};
		
		int total = maths+english+kiswahili+science+sst;
		
		//System.out.println("The total is ="+total);
		//System.out.println("The grade is = "+getGrade(total));
		//test our modularized code
		printMyData("The total of test is",total);
		printMyData("The Grade is ",getGrade(total));
		printMyData(getHighestScores(subjects, scores));
		printMyData(getLeastScores(subjects, scores));
		int[] sumProduct = calculateSumAndProduct(scores);
		 printMyData("Sum of scores is " + sumProduct[0]);
        printMyData("Product of scores is " + sumProduct[1]);
		
		
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
	public static String getHighestScores(String[] subjects, int[] scores)
	{
		int maxIndex = 0;
         for(int i = 1; i < scores.length; i++)
		 {
			 if(scores[i] > scores[maxIndex])
			 {
				 maxIndex = i;
			 }
		 }	
return subjects[maxIndex]+"is the best score"+scores[maxIndex];		 
	}
	public static String getLeastScores(String[] subjects, int[] scores)
	{
		int minIndex = 0;
		for(int i = 1; i < scores.length; i++)
		{
		if(scores[i] < scores[minIndex])
		{
			minIndex = i;
		}
		}
		return subjects[minIndex]+"the least score is"+scores[minIndex];
	}
	public static int[] calculateSumAndProduct(int[]scores)
	{
		int sum = 0;
		int product = 1;
		for( int score : scores)
		{
			sum += score;
			product *= score;
		}
		
		return new int[] {sum,product};
	}

	public static void printMyData(String statement,int data )
	{
		
		System.out.println(statement+ data );
	}
	
	public static void printMyData(String statement, char data)
	{
		System.out.println(statement+data);
	}
	public static void printMyData(String message)
	{
		System.out.println(message);
	}
	public static void printMyData(int data)
	{
		System.out.println(data);
	}
	
}  
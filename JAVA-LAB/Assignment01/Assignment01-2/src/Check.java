import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the first Double number: ");
	if(sc.hasNextInt())
	{
	 System.out.println("Error: Input is not a Double Number");
	 return;
	 
	 }
	
	double FirstNumber=sc.nextDouble();

	System.out.println("Enter the Second double Number: ");
	if(sc.hasNextInt())
	{
		System.out.println("Error: Input is not a Double Number");

	}
	
	double SecondNumber = sc.nextDouble();
	
	double average = (FirstNumber + SecondNumber) / 2;
	System.out.println("The average of " + FirstNumber + " and " + SecondNumber + " is " + average);
	
	Scanner Close;
		
		
	}

}

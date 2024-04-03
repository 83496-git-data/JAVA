import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number- ");
		int number = sc.nextInt();
		
		System.out.println("Given Number- "+number);
		System.out.println("Binary equivalent is : "+ Integer.toBinaryString(number));
		System.out.println("Octal equivalent is : "+ Integer.toOctalString(number));
		System.out.println("Hexadecimal equivalent : "+ Integer.toHexString(number));
		
	}

}

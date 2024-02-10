package stackParenthesis;

import java.util.Scanner;
public class DriverApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the expression");
		String input=sc.next();
		
		MyStack ms=new MyStack();
		if(input.length()%2==1)
		{
			System.out.println("Incomplete expression");
		}
		else
		{
			if(ms.validate(input))
			{
				System.out.println("Valid expression");
			}
			else
			{
				System.out.println("Invalid expression");
			}
		}
	}
}

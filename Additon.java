//Write a program to adddition of two numbers also addition of two characters.
package Day1;

import java.util.Scanner;

public class Additon 
{
public static void main(String[] args)
{
	int a,b,sum;
	char ch1,ch2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a:");
	a = sc.nextInt();
	System.out.println("Enter value of b:");
	b = sc.nextInt();
	System.out.println("Enter first character:");
	ch1 = sc.next().charAt(0);
	System.out.println("Enter second character");
	ch2 = sc.next().charAt(0);
	sc.close();
	sum = a+b;
	System.out.println("Sum of two nos="+sum);
    System.out.println("Addition of two characters="+ch1+ch2);
}	
}

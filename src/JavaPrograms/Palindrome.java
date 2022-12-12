package JavaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
String Original, reverse="";
Scanner scan = new Scanner(System.in);
int length;
System.out.println("enter the num or string");
Original = scan.nextLine();
length=Original.length();
for(int i=length-1;i>=0;i--) {
reverse=reverse+Original.charAt(i);
}
System.out.println("reverse is;"+reverse);
if (Original.equals(reverse))
	System.out.println("The string is palindrome");
	else
		System.out.println("The string is not a palindrome");
}
}

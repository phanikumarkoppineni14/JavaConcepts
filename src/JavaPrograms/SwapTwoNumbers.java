package JavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
int x,y,temp;
System.out.println("enter x and y");
Scanner cs= new Scanner(System.in);
x=cs.nextInt();
y=cs.nextInt();
System.out.println("Before swapping "+x+y);
temp=x;
x=y;
y=temp;

System.out.println("Before swapping"+x+y);
	}

}

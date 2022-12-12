package JavaPrograms;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num= scan.nextInt();
    StringBuffer sb= new StringBuffer(String.valueOf(num));
    StringBuffer rev= sb.reverse();
    System.out.println("Reverse Number is :"+rev);
	}
}

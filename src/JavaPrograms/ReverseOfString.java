package JavaPrograms;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
     Scanner scan =new Scanner(System.in) ;
     System.out.println("enter name");
     //Convert sting to char array
     String name= scan.nextLine();
     char ch[]= name.toCharArray();
     int j=ch.length-1;
     for(int i=0; i<ch.length/2;i++) {
    	 char c=ch[i];
    	 ch[i]=ch[j];
    	 ch[j]=c;
    	 j--;
     }
     //convert char array to string
     name=new String(ch);
     System.out.println(name);   
	}

}

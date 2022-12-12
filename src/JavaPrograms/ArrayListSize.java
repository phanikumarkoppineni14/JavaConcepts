package JavaPrograms;

import java.util.ArrayList;

public class ArrayListSize {

	public static void main(String[] args) {
		 // create an ArrayList
	    ArrayList<Integer> primeNumbers = new ArrayList<>();
	    primeNumbers.add(2);
	    primeNumbers.add(3);
	    primeNumbers.add(5);
	    primeNumbers.add(7);
	    System.out.println("ArrayList: " + primeNumbers);

	    // get the number of elements of arraylist
	    int size = primeNumbers.size();
	    System.out.println("Length of ArrayList: " + size);
	}

}

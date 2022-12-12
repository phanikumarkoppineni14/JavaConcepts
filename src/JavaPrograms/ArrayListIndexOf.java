package JavaPrograms;

import java.util.ArrayList;

public class ArrayListIndexOf {

	public static void main(String[] args) {
		// create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // insert element to the array list
        numbers.add(22);
        numbers.add(13);
        numbers.add(35);
        System.out.println("Number ArrayList: " + numbers);

        // find the position of 13
        int position1 = numbers.indexOf(13);
        System.out.println("Index of 13: " + position1);

        // find the position of 50
        int position2 = numbers.indexOf(50);
        System.out.println("Index of 50: " + position2);
	}

}

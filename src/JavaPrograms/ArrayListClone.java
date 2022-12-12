package JavaPrograms;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {

        // create an array list
        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(3);
        number.add(5);
        System.out.println("ArrayList: " + number);

        // create copy of number
        ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();
        System.out.println("Cloned ArrayList: " + cloneNumber);
	}

}

package JavaPrograms;

import java.util.ArrayList;

public class ArrayListGet {

	public static void main(String[] args) {
		// create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // insert element to the array list
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // access element at index 1
        String element = languages.get(1);
        System.out.println("Element at index 1: " + element);
	}

}

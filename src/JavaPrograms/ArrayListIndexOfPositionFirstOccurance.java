package JavaPrograms;

import java.util.ArrayList;

public class ArrayListIndexOfPositionFirstOccurance {

	public static void main(String[] args) {
		// create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // insert element to the arraylist
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");
        System.out.println("Programming Languages: " + languages);

        // get the position of Java
        int position = languages.indexOf("Java");
        System.out.println("First Occurrence of Java: " + position);
	}

}

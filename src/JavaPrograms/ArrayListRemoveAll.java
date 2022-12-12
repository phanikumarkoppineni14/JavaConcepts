package JavaPrograms;

import java.util.ArrayList;

public class ArrayListRemoveAll {

	public static void main(String[] args) {
		// create an array list
        ArrayList<String> languages = new ArrayList<>();

        // add elements to array list
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // remove all elements from array list
        languages.removeAll(languages);
        System.out.println("ArrayList after removeAll(): " + languages);
	}

}

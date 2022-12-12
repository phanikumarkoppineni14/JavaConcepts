package JavaPrograms;

import java.util.ArrayList;

public class ArrayListAddAll {

	public static void main(String[] args) {

		// create an array list
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("Java");
	    languages.add("Python");
	    System.out.println("Languages: " + languages);

	    // create another array list
	    ArrayList<String> programmingLang = new ArrayList<>();

	    // add all elements from languages to programmingLang
	    programmingLang.addAll(languages);

	    System.out.println("Programming Languages: " + programmingLang);
	  }
	}

	// Output: Languages: [Java, Python]
//	         Programming Languages: [Java, Python]
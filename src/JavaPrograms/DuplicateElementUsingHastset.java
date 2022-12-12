package JavaPrograms;

import java.util.HashSet;

public class DuplicateElementUsingHastset {

	 public static void main(String[] args) {
		String arr[]= {"phani","satya","hari","hari","kumar"};
		HashSet<String>langs=new HashSet();
		boolean flag=false;
		for(String L:arr) {
			if (langs.add(L)==false) {
				System.out.println("found duplicate element:"+L);
				flag=true;
			}
		}
		if (flag==false) {
			System.out.println("not found duplicate");
		}
	}
}

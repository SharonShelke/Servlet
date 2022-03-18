package hello;

import java.util.Arrays;

public class arrayMethod {

	public static void main(String[] args) {
		int[] grades1 = {1,2,3,72,5};
		int[] grades2 = grades1;
		
		if(grades1 == grades2) {
			System.out.println("equals");
		}
		if(grades1.equals(grades2)) {
			System.out.println("equals");
		}
		System.out.println(grades1 + " " + grades2);
		
		if(Arrays.equals(grades1,grades2)) {
			System.out.println("equals finally");
			int[] grades = {1,2,3,72,5};
			Arrays.fill(grades, 72);
			System.out.println(Arrays.toString(grades));
			//List<String> testing = Arrays.asList(grades);
		}
	}

}

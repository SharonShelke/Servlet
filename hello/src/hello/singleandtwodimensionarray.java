package hello;

import java.util.Arrays;

public class singleandtwodimensionarray {

	public static void main(String[] args) {
		int[][] grades = {
				{1,5,3},
				{8,4,2,4,3,5,3},
				{4,6,2}
		};
		System.out.println(grades [1][4]);
	//	System.out.println(Arrays.deepToString(grades));
		System.out.println(grades[0].length);
		
		
		for(int row = 0 ; row < grades.length; row++) {
			for(int cols = 0; cols < grades[row].length; cols++) {
				System.out.println(grades[row][cols] + " ");
			}
			System.out.println();
		}
	}

}

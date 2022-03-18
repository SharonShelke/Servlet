package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayList {
	//list

	public static void main(String[] args) {
		int[] gradeees = {1,4,3,3};
	List<Integer> grades = Arrays.asList(5,3,2,6,3);
		
		//System.out.println(grades.size());
		//System.out.println(Arrays.toString(grades.toArray()));
		//List<Integer> grades = new ArrayList<Integer>();
		/*
		 * grades.add(5);
		grades.add(10);
		grades.add(1,7);
		System.out.println(grades.get(0));
		System.out.println(grades.get(1));
		System.out.println(grades.indexOf(70));
		System.out.println(grades.contains(7));
		 * 
		 * 
		 */
		for(int i =0 ; i < grades.size(); i++){
			grades.set(i,grades.get(i)* 2);
			System.out.println(grades.get(i));
		}
		//for each loop
		for(int grade: grades){
			System.out.println(grade);
			
		}
		//for nestested list
		List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
		allGrades.add(Arrays.asList(5,3,2,6,3));
		allGrades.add(Arrays.asList(5,4,2,7,5));
		allGrades.add(Arrays.asList(2,1,4,4,83));
		
		for(List<Integer> gradess : allGrades){
			for(int grade:grades){
				System.out.println(grade);
			}
			System.out.println();
			}
		List<Integer> allMark =Arrays.asList(5,3,2,6,3);
		Collections.sort(allMark);
		Collections.reverse(allMark);
		
		for(int grade : allMark){
			System.out.println(grade);
		}
	//while(!grades.isEmpty())
	{
		//System.out.println(grades.remove(0));
		//grades.clear();
	}
	}
	

}

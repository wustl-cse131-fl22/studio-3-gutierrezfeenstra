package studio3;

import java.util.Scanner;

public class Test {

	
	public static String charCopies(char c, int copies) {
		String s = "[";
		while(copies > 0){
			s = s+c;
			copies--;
		}
		return s+"]";
	}
	
	
	public static void main(String[] args) {
		int[] values = {1,2,3,4,5};
		for(int i=1; i<values.length-1; i++) {
			System.out.println(values[i]);
		}
			
	}
	
}

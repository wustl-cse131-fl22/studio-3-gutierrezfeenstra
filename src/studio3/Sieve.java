package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       
      System.out.println("What number are we going to?");
        int n = in.nextInt();
        int i = 0;
        int iMu = 2;
        int[] test = {0,1,2,3,4,5,6,7,8,9,10};
        boolean array[] = new boolean [n+1];
      
          for(i = 1; i <= n; i++) {
        	  array[i] = true;
          }
        	  
         
          for(iMu = 2; iMu*2 <= n; iMu++) {
          
        	 if (array[iMu * 2] = true){
        		 
        	  for (i = 2* iMu; i <= n; i+=iMu){
        		  array[i] = false;
        	  }
        	 }
          }
      
       for (i = 2; i <= n; i++){
    	   if (array[i] == true){
    		   
    		   System.out.print(i + " ");
    	   }
       }
      
       {
    	   System.out.print("are the prime numbers");
    	   System.out.println(" from 0 to " + n);
       }
      
     
       
       
	}

	private static Object i(int n, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

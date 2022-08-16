package com.prashansha.codingPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		
		PlusOne plusoNe=new PlusOne();
		plusoNe.plusOne(null);

	}
	
	 public int[] plusOne(int[] digits) {
	       
	        int number=0;
	        int power_counter=digits.length-1;
	            for(int i=0;i<digits.length;i++)
	            {
	                number=number + (int)(Math.pow(10,power_counter))*digits[i];
	                power_counter--;
	            }
	        number=number+1;
	      
	       List<Integer> listN=new ArrayList<>();
	        while(number>0)
	        {
	            int digit=number%10;
	            listN.add(digit);
	            number=number/10;    
	        }
	        Collections.reverse(listN);
	        Integer[] integerArray = Arrays.asList(listN.toArray())
                    .toArray(new Integer[0]);
                // .toArray(new Integer[objectArray.length]);
	        int[] arr=integerArray;
	        
	        
	        
	        
	        
	    }

}

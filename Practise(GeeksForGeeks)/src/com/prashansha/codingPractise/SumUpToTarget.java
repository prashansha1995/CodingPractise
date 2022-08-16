package com.prashansha.codingPractise;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumUpToTarget {

	public static void main(String[] args) {
		int [] arr= {-1,-2,-3,-4,-5};
		int[] arr1=twoSum(arr,-8);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}

	}

	public  static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> indicies=new ArrayList<>();
       
       if(target==0)
       {
    	   for(int i=0;i<nums.length;i++)
    	   {
    		   if(target==nums[i])

    	   {
    			   indicies.add(i);
    			   }
    	   }
    	  
       }
        int temp=0;
       
       for (int i=0;i<nums.length;i++)
        {
    	   
            if(nums[i]<=target){
                temp=temp+nums[i];
                indicies.add(i);
             
            }
           
           if(temp==target)
           {
               return 
               indicies.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
           }
            
           int pos=searchValue(target-temp,i+1,nums);
           if(pos==-1?false:true)
           {
        	   indicies.add(pos);
               return indicies.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
           }
           else
           {
               temp=temp-nums[i];
                indicies.remove(indicies.size()-1);
           }
        }
         return 
               indicies.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
    }

	private static int searchValue(int diff, int i,int nums[]) {
		for(int pos=i;pos<nums.length;pos++)
		{
			if(nums[pos]==diff)
			{
				return pos;
			}
		}
		return -1;
	}

}

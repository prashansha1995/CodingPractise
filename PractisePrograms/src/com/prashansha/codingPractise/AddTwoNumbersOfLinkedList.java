package com.prashansha.codingPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AddTwoNumbersOfLinkedList {

	public static void main(String[] args) {
		addTwoNumbers(new ListNode(243),new ListNode(564));

	}
	 public  static void   addTwoNumbers(ListNode l1, ListNode l2) {
		 public int[] twoSum(int[] nums, int target) {
		        Map<Integer,Integer> map=new HashMap<>();
		       
		        for(int i=0;i<nums.length;i++)
		        {
		            map.put(i,nums[i]);
		        }
		        int temp=0;
		        List<Integer> indicies=new ArrayList<>();
		       for (Map.Entry<Integer,Integer> entry : map.entrySet())
		        {
		            if(entry.getValue()<target){
		                temp=temp+entry.getValue();
		                indicies.add(entry.getKey());
		            }
		           
		           if(temp==target)
		           {
		               return 
		               indicies.stream()
		                            .mapToInt(Integer::intValue)
		                            .toArray();
		           }
		            
		           if(map.containsValue(target-temp))
		           {
		               int diff=target-temp;
		                indicies.add(map
			      .entrySet()
			      .stream()
			      .filter(x -> ((Integer)(diff)).equals(x.getValue()))
			      .map(Map.Entry::getKey).findFirst().get());
		               return indicies.stream()
		                            .mapToInt(Integer::intValue)
		                            .toArray();
		           }
		           else
		           {
		               temp=temp-entry.getValue();
		                indicies.remove(indicies.size()-1);
		           }
		        }
		         return 
		               indicies.stream()
		                            .mapToInt(Integer::intValue)
		                            .toArray();
		    }

		
	 }
}

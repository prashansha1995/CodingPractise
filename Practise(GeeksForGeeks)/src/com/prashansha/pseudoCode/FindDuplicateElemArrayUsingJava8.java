package com.prashansha.pseudoCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElemArrayUsingJava8 {
	
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);		
		 Set<Integer> set=FindDuplicateElemArrayUsingJava8.usingFrequencyMethod(list);
		 System.out.println(set);
		 
		 System.out.println(FindDuplicateElemArrayUsingJava8.addingNegationToSet(list));
	}
	
	public static Set<Integer> usingFrequencyMethod(List<Integer> list)
	{
		
		Set<Integer> set=list.stream().filter(x-> Collections.frequency(list, x)>1).collect(Collectors.toSet());
		
		return set;
	}
	
	public static Set<Integer> addingNegationToSet(List<Integer> list)
	{
		Set<Integer> items=new HashSet<>();
		
		Set<Integer> set=list.stream().filter(x->!items.add(x)).collect(Collectors.toSet());  //Set.add() returns false if the element was already in the set.
		
		return set;
	}
	


}

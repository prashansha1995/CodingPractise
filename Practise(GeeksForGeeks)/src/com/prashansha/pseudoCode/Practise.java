package com.prashansha.pseudoCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Practise {

	public static void main(String[] args) {
		Practise obj=new Practise();
		obj.checkOverloading(new Integer(1));
		obj.checkOverloading(4.0f);
		
		
		Map<String, Integer> unsortMap = new LinkedHashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        unsortMap.put("f", 9);


        System.out.println("Original...");
        System.out.println(unsortMap);

        //sort by values, and reserve it, 10,9,8,7,6...
        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        System.out.println(result);
        
        //sorting by key in reverse order
        
        Map<String,Integer> sortedMapByKey=unsortMap.entrySet().stream().
        		sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
        		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
        System.out.println(sortedMapByKey);
        
        
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(0);
        list.add(-1);
        list.add(1);
        list.add(9);
        
        Set<Integer> setEx=new LinkedHashSet<>(list);
        System.out.println(setEx);
        setEx.add(9);
        
        Map<Integer,Integer> freqMap=new HashMap<>();
        int arr[]= {1,3,5,9,9,1};
       for(Integer i:arr)
       {
    	   if(!freqMap.containsKey(i))
    		   freqMap.put(i,1);
    	   else
    		   {//int value=freqMap.get(i);
    		   freqMap.put(i, freqMap.get(i)+1);}
       }
       
       System.out.println("freqMap"+freqMap);
        
        
        
        Collections.sort(list);
        System.out.println("list is"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("list is"+list);
        
        int frstEle=list.stream().findFirst().get();
        System.out.println(frstEle);
        
        
        String frstEleMapKey=unsortMap.entrySet().stream().findFirst().get().getKey();
        System.out.println(frstEleMapKey);
        
        Map<String,Integer> treeMap=new TreeMap<String,Integer>(unsortMap);
        System.out.println("Treemap sorted"+treeMap);

        
        
        
        
        
        
        
        
		
	}
	
	public String checkOverloading(int a ) {
		System.out.println("Calling without object");
		return "";
	}
	public int checkOverloading(Object a ) {
		System.out.println("Calling with object");
		return 0;
	}
	
	public String checkOverloading(float a ) {
		System.out.println("float");
		return "";
	}
	public static String checkOverloading(short a) {
		return "";
	}
	
	public String checkOverloading(double a ) {
		System.out.println("double");
		return "";
	}
}


 class Class2{}

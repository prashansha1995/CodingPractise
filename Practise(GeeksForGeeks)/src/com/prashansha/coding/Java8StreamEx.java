package com.prashansha.coding;

import java.util.List;
import java.util.OptionalInt;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8StreamEx {
	 public static void main(String args[]) 
	  {
	// create a list of integers 
    List<Integer> number = Arrays.asList(2,3,4,5,-2); 
    
    //Find minimum
    Integer minNumber=number.stream().min(Integer::compare).get();
    System.out.println("Minimum number from List is "+minNumber);
    
  //Find maximum way 1
    Integer maxNumberWay1=number.stream().max(Integer::compare).get();
    System.out.println("Maximum number from List is from maxNumberWay1 "+maxNumberWay1);

    //Find maximum way 2
    int maxNumberWay2= number.stream().mapToInt(x->x).max().getAsInt();
    System.out.println("Maximum number from List is from maxNumberWay2 "+maxNumberWay2);

    
    //Find average
    double average= number.stream().mapToInt(x-> x).average().getAsDouble();
    System.out.println("Average of  numbers from List is "+average);
  
    //Find sum
    int sum= number.stream().mapToInt(x->x).sum();
    System.out.println("Sum of  numbers from List is "+sum);
    
    //to get whole summary of statictis(min,max ,average,sum)
    IntSummaryStatistics summary=number.stream().mapToInt(x-> x).summaryStatistics();
    System.out.println("Get whole summary of Statistics from List is "+summary);
    
    //get max from summary
    System.out.println("Get max number from  summary of Statistics from List is "+summary.getMax());
    
    
    // demonstration of map method 
    List<Integer> square = number.stream().map(x -> x*x). 
                           collect(Collectors.toList()); 
    System.out.println(square); 
    
   
  
    // create a list of String 
    List<String> names = 
                Arrays.asList("Reflection","Collection","Stream"); 
  
    // demonstration of filter method 
    List<String> result = names.stream().filter(s->s.startsWith("S")). 
                          collect(Collectors.toList()); 
    System.out.println(result); 
  
    // demonstration of sorted method 
    List<String> show = 
            names.stream().sorted().collect(Collectors.toList()); 
    System.out.println(show); 
  
    // create a list of integers 
    List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
  
    // collect method returns a set 
    Set<Integer> squareSet = 
         numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
    System.out.println(squareSet); 
  
    // demonstration of forEach method 
    number.stream().map(x->x*x).forEach(y->System.out.println(y)); 
  
    // demonstration of reduce method 
    int even = 
       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
  
    System.out.println(even); 
	  }
}

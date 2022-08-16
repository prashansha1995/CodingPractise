package com.prashansha.codingPractise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCommonPrefix {

	public static void main(String[] args) {
		StringCommonPrefix sb=new StringCommonPrefix();
		String[] strs = {"a","a","b"};
		String commonPrefixString=sb.longestCommonPrefix(strs);
		System.out.println(commonPrefixString);

	}
	
	 public String longestCommonPrefix(String[] strs) {
		 if(strs.length==1)
		 {
			 return strs[0];
		 }
        boolean allStringEqual=true;
        for(int i=1;i<strs.length;i++)
        {
            if(!strs[0].equals(strs[i]))
            {
                allStringEqual=false;
            }
        }
        
        if(allStringEqual==true)
        {
            return strs[0];
        }
	        Map<Integer,Integer> strLength =new LinkedHashMap<>();
	        //find smallest string
	        
	        //1-  //create map with length of each string
	        for(int i=0;i<strs.length;i++)
	        {
	            strLength.put(i,strs[i].length());
	        }
	        
	        //step 2 //find smallest
	        LinkedHashMap<Integer, Integer> temp
	            = strLength.entrySet()
	                  .stream()
	                  .sorted((i1, i2)
	                              -> i1.getValue().compareTo(
	                                  i2.getValue()))
	                  .collect(Collectors.toMap(
	                      Map.Entry::getKey,
	                      Map.Entry::getValue,
	                      (e1, e2) -> e1, LinkedHashMap::new));
	        
	        String smallString =strs[temp.entrySet().iterator().next().getKey()];
	        if(smallString.length()==0)
	        {
	        	return "";
	        }
	       
	        
	          
	            
	        
	        //compare smallest with others
	        String commonPrefixArray[] = new String[strs.length-1];
	        int k=0;
	        //check with string u are comparing isnt the same,can check index
	        for(String str:strs) {
	        	
	        	String commonPrefix="";
	        	if(!str.equals(smallString))
	        	{
	        		if(str.charAt(0)!=smallString.charAt(0))
        			{
	        			commonPrefixArray[k]=commonPrefix;
		        		k++;
        				continue;
        			}
	        		for(int i=0;i<smallString.length();i++)
	        		{
	        			
	        			if(str.charAt(i)==smallString.charAt(i))
	        			{
	        				commonPrefix=commonPrefix + str.charAt(i);
	        			}
	        			else
	        			{
	        				break;
	        			}
	        			
	        		}
	        		commonPrefixArray[k]=commonPrefix;
	        		k++;
	        	}
	        }
	        
	       Map<String,Integer> commonPrefixLength=new LinkedHashMap<>();
	       
	       for(String str:commonPrefixArray) {
	    	  
//	    	  if(str==null)
//	    	  {
//	    		  str="";
//	    	  }
	    	   commonPrefixLength.put(str, str.length());
	    	  
	       }
	       LinkedHashMap<String, Integer> temp1
           = commonPrefixLength.entrySet()
                 .stream()
                 .sorted((i1, i2)
                             -> i1.getValue().compareTo(
                                 i2.getValue()))
                 .collect(Collectors.toMap(
                     Map.Entry::getKey,
                     Map.Entry::getValue,
                     (e1, e2) -> e1, LinkedHashMap::new));
       
       String commonPrefixString =temp1.entrySet().iterator().next().getKey();
       if(commonPrefixString.length()==0)
       {
    	   return "";
       }
	        	 return commonPrefixString;
	    }

}

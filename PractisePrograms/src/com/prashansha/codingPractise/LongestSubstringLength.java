  package com.prashansha.codingPractise;

public class LongestSubstringLength {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aab"));

	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        int start_pos=0;
	        String temp="";
	        String substring="";
	        for(int i=start_pos;i<s.length();i++)
	        {
	            if(!(temp.contains(Character.toString(s.charAt(i)))))
	            {
	                temp=temp+Character.toString(s.charAt(i));
	            }
	            else if(temp.length()>substring.length())
	            {
	                substring=temp;
	                i=start_pos++;
	                temp="";
	            }else{
	            i=start_pos++;
	            temp="";}
	        }
	       if(temp.length()>substring.length())
	            {
	                substring=temp;
	               
	            }
	        return substring.length()==0?temp.length():substring.length();
	        
	    }

}

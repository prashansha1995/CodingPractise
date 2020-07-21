package com.prashansha.searchingTechniques;

/**
 * Ternary search is a divide and conquer algorithm that can be used to find an element in an array. It is similar to binary search where we divide the array into two parts but in this algorithm. In this, we divide the given array into three parts and determine which has the key (searched element). We can divide the array into three parts by taking mid1 and mid2 which can be calculated as shown below. Initially, l and r will be equal to 0 and n-1 respectively, where n is the length of the array.

    mid1 = l + (r-l)/3
    mid2 = r – (r-l)/3
  @author Prashansha Gupta
 *
 */
public class TernarySearchEx {

	public static void main(String[] args) {
		
		//Enter the array in ascending order
		int arr[]={1,3,6,8,9,12,45,67,89,90};
		//Find the element
		int index=getIndex(0,arr.length-1,89,arr);
	
		if(index>0)
			System.out.println("Element found at position : "+(index+1));
		else
			System.out.println("Not present");
	}
	
	public static int getIndex(int left,int right,int ele,int arr[])
	{
		if(right>=1){
		int mid1=left+(right-left)/3;
		int mid2=right-(right-left)/3;
		
		if(arr[mid1]==ele)
			return mid1;
		
		if(arr[mid2]==ele)
			return mid2;
		
		if(ele<arr[mid1])
			return getIndex(left,mid1-1,ele,arr);
		
		else if(ele>arr[mid2])
			return getIndex(mid2+1,right,ele,arr);
		
		else
			return getIndex(mid1+1,mid2-1,ele,arr);
		}
		return -1;
	
	}

}

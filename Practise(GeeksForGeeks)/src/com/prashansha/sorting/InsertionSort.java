package com.prashansha.sorting;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,2,10,12,1,5,6};
         int sorted_arr[]=insertion_sort(arr);
         for(Integer ele:sorted_arr)
         {
        	 System.out.println(ele);
         }
	}

	private static int[] insertion_sort(int[] arr) {
		
		for(int i=1;i<=arr.length-1;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
		
	}

}

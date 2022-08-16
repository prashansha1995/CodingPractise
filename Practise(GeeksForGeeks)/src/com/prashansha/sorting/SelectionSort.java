package com.prashansha.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {20,35,-15,7,55,1,-22};
		int sortedArr[]=sortArray(arr);
		
		for(int i=0;i<=sortedArr.length-1;i++)
		{
			System.out.println(sortedArr[i]);
		}

	}

	public static int[] sortArray(int unsortArr[])
	{
		
		
		for(int i=unsortArr.length-1;i>=0;i--)
		{
			int max_index=0;
			int max_ele=unsortArr[0];
			for(int j=1;j<=i;j++)
			{
				if(unsortArr[j]>max_ele)
				{
					max_ele=unsortArr[j];
					max_index=j;
				}
			}
			int temp=unsortArr[i];
			unsortArr[i]=max_ele;
			unsortArr[max_index]=temp;
		}
		
		return unsortArr;
	}
}

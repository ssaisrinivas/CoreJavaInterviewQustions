package com.sai.practice;

public class BinarySearch {
	
	int binarySearch(int[] array,int initIndex,int lastIndex,int element) {
		
		while (initIndex <= lastIndex) {
		int middleIndex =(initIndex+lastIndex)/2;
		
		if(array[middleIndex]==element)
			return middleIndex;
		
		else if(array[middleIndex]>element) {
			
			lastIndex=middleIndex-1;
		}
		
		else if(array[middleIndex]<element) {
			
    	  initIndex=middleIndex+1;
		}
		
		}		
		
		return -1;	
		
	}
	
	public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
 
        int arr[] = { 2, 3, 4, 10, 40,59,70,90,100 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result+"  Element is :"+arr[result]);
    }

}

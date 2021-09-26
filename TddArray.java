package com.java.tdd;

import java.util.Arrays;

public class TddArray {
	public static int kthSmallest(int[] arr,
            int k)
{
// Sort the given array
Arrays.sort(arr);

// Return k'th element in
// the sorted array
return arr[k - 1];
}

// driver program
public static void main(String[] args)
{
Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
int k = 4;
System.out.print("fourth largest " + kthSmallest(arr, k));
}
	

}

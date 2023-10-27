package com.sunbeam;

import java.util.Arrays;

public class insertionSort {
	public static void  insertionSortt(int arr[],int n) {
		for(int i=1;i<n;i++) {
		int temp=arr[i];
        int j=i-1;
        while(j>= 0 && arr[j]>temp) {
        	arr[j+1]=arr[j];
        	j--;
        }
        arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int  arr[]= {22,66,99,77,88,11};
		System.out.println("Before InsertionSort"+Arrays.toString(arr));
		insertionSortt(arr,arr.length);
      System.out.println("After InsertionSort"+Arrays.toString(arr));
	}

}

package com.sunbeam;

import java.util.Arrays;

public class bubbleSort {
	public static void bubbleSortt(int arr[],int n) {
		int count=0;
		int pass=0;
		int flag;
		
            for(int i=1;i<n;i++) {
            	pass++;
            	flag=0;
            	for(int j=0;j<n-i;j++) {
            		count++;
            		if(arr[j] > arr[j+1]) {
            			int temp = arr[j];
    					arr[j] = arr[j + 1];
    					arr[j + 1] = temp;
    					flag=1;
            		}
            		
            	}if(flag==0)
            		break;
            }
            
           System.out.println("NO of pass"+pass);	
           System.out.println("No of comparision::"+count);
	}
	public static void main(String[] args) {
		int arr[]= {88,77,22,11,99,33};
		System.out.println("Before Sorting"+Arrays.toString(arr));
		bubbleSortt(arr,arr.length);
		System.out.println("After Sorting"+Arrays.toString(arr));

	}

}

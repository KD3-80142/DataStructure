package com.sunbeam;

import java.util.Arrays;

public class Demo {
     public static  void selectionSort(int arr[],int n) {
    	 int count=0;
    	 int pass=0;
    	 int flag;
    	 for(int i=0;i<n;i++) {
    		 pass++;
    		 flag=0;
    		 
    		 for(int j=i+1;j<n;j++) {
    			 count++;
    			if(arr[i]>arr[j]) {
    			int  temp;
    			 temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    			 flag=2;
    		 }
    			  
    		 
    	 }
    		 if(flag==0)
    		 break;
    	 	  
     }
    	 System.out.println("NO of pass"+pass);
    	 System.out.println("No of  Copmarison::"+count);
	}
	public static void main(String[] args) {
	 int  arr[]= {77,99,22,88,11,33};
	 System.out.println("Befor sort"+Arrays.toString(arr));
	 selectionSort(arr, arr.length);
	 System.out.println("After sort"+Arrays.toString(arr));
	
	 
}
}

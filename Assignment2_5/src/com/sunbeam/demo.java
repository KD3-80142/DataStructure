package com.sunbeam;

import java.util.Arrays;

public class demo {
	public static void sortBySalary(employees [] arr,int n) {
		for(int i=1;i<n;i++) {
			employees temp=arr[i];
	        int j=i-1;
	        while(j>= 0 && arr[j].getSalary()>temp.getSalary()) {
	        	arr[j+1]=arr[j];
	        	j--;
	        }
	        arr[j+1]=temp;
			}

	}

	public static void main(String[] args) {
	 employees[]arr = new employees[5];
	 arr[0]= new employees(25000,"raj",11);
	 arr[1]= new employees(200,"Scott",10);
	 arr[2]= new employees(410,"king",41);
	 arr[3]= new employees(4101,"Leo",101);     
     arr[4]= new employees(7500,"Matter",1);
     System.out.println("Before sort\n"+Arrays.toString(arr));
     sortBySalary(arr,arr.length);
     System.out.println("Before sort\n"+Arrays.toString(arr));
	}

	
	
   
}

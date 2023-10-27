package com.sunbeam;

import java.util.Scanner;

public class linerMain {

	public static void main(String[] args) {
		int choice;
		linearQueue p =new linearQueue(5);
		
		Scanner sc= new Scanner(System.in);
		
		do {
			System.err.println("Enter your choice");
			System.out.println(" 1 Add data");
			System.out.println(" 2 delete data");
			System.out.println(" 3 peek data");
			
			choice= sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Bye.......");
				break;
			case 1:
				  if(p.isFull())
				     System.out.println("\nStack is Full");
				  else {
					  System.out.println("Enetr element");
					 int ele =sc.nextInt(); 
					 p.push(ele);
				  }
				break;
			case 2:
				 if(p.isEmpty())
					 System.out.println("Satck is empty");
				 else {
					 p.pop();
				 }
				break;
			case 3:
				 if(p.isEmpty())
					 System.out.println("Satck is empty");
				 else {
					 System.out.println("Peek  data is "+p.peek());
				 }
				break;
				default:System.out.println("Worng choice........ :( ");
			}
			
		} while (choice != 0);
        System.out.println("thanxxx For using Apllication.... seee you soon :) ");
        sc.close();
	}

}

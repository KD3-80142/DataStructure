package com.sunbeam;

public class linearQueue {
	private int arr[];
	private int rear,front;
	private final int SIZE;
	public linearQueue(int size) {
		// TODO Auto-generated constructor stub
		SIZE=size;
		arr = new int[SIZE];
		front  =-1;
		rear = -1;
	}
	 public void push(int data) {
		 rear++;
		 arr[rear]=data;
	 } 
	 public void pop() {
		// TODO Auto-generated method stub
         front++;
	}
	public int  peek() {
		// TODO Auto-generated method stub
        return arr[front+1]; 
	}
   public boolean isFull() {
		// TODO Auto-generated method stub
         return rear==SIZE-1;
	}
   public boolean isEmpty() {
	   return front==rear;
   }
}

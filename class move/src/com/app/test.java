package com.app;

public class test {
	
	static void moveToEnd(int arr[],int n){
		int count=0; //no of non zero elements
		
		for(int i=0;i<n;i++)
			if(arr[i] !=0)
				arr[count++]=arr[i];
		
		while(count<n)
			arr[count++]=0;
			
	}
	
	public static void main(String[] args) {
		
		int arr[]={1,8,0,5,3,2,0};
		int n=arr.length;
		moveToEnd(arr, n);
		System.out.println("after moving :");
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}

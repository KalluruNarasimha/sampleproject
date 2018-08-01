package com.app;
public class FindDuplicateCharacters {

	public static void main(String args[]) { 
		int a[]={23,85,69,45,78,21,35,62,65,72};
		int n=a.length;
		System.out.println("Before babul sort elements");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		int temp=0;
		  for(int i=0;i<n;i++){
			  for(int j=0;j<n-i-1;j++){
				  if(a[j+1]>a[j]){
				  temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
				  }
				  
			  }
			  
		  }
		  System.out.println("After sorting");
		  for(int i=0;i<n;i++){
			  System.out.println(a[i]);
		  }
		
		}
		
	
	
	}
	


package com.arrays2;
import java.util.*;
public class Add2Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter"+n+"elements:");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int[] arr2=new int[n];
		System.out.println("Enter"+n+"elements:");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		int[] arr3=new int[n];
		for(int i=0;i<n;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println( "add the elements in array3:");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]+" ");
		}
		sc.close();

	}

}

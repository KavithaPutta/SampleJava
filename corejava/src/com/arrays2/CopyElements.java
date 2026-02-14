package com.arrays2;
import java.util.*;
public class CopyElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter"+n+"elements:");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Elements to copied new Array:");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]+" ");
		}
		sc.close();
	}

}

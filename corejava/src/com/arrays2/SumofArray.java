package com.arrays2;
import java.util.*;
public class SumofArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		System.out.println("Enter"+n+"elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
        System.out.println("Sum of Array elements="+sum);
        sc.close();
	}

}

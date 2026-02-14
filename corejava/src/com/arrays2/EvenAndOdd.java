package com.arrays2;
import java.util.*;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int evenCount=0;
		int oddCount=0;
		System.out.println("Enter"+n+"elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
        if(arr[i]%2==0) {
        	evenCount++;
        }
        else {
        	oddCount++;
        }
	}
		System.out.println("EvenCount="+evenCount);
		System.out.println("oddCount="+oddCount);
		sc.close();

}
}
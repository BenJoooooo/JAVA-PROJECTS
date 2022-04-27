package com.ThisIsAPackage;
import java.util.Scanner;

public class binarySearchTree {
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r>=1) {
			int mid = 1 + (r-1) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x) 
				return binarySearch (arr,l,mid-1,x);
				return binarySearch (arr, mid+1,r,x);
		}
		return -1;
	}
	static int findPos(int arr[], int key) {
		int l = 0, h = 1;
		int val = arr[0];
		
		while (val < key) {
			l = h;
			if (2*h < arr.length-1)
				h=2*h;
			else
				h= arr.length;
			val = arr[h];
		}
		return binarySearch(arr,l,h,key);
	}
	static void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int minIndex = i;
			for (int j = i+1; j <n;j++)
				if(arr[j] < arr[minIndex])
					minIndex = j;
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter array size: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Input " + n + " data: \n");
		for (int i = 0; i < n; i++) {
			System.out.print("Value " + (i+1) + ": ");
			arr[i] = in.nextInt();
		}
		System.out.println("\nThe elements in array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nSorted data: ");
		selectionSort(arr);
		printArray(arr);
		int search = in.nextInt();
		int ans = findPos(arr,search);
		if (ans == -1) 
			System.out.println("Element not found");
		else
			System.out.println("Element found at index" + ans);
	}
}
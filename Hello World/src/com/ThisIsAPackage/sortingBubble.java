package com.ThisIsAPackage;
import java.util.Scanner;
import java.util.Arrays;

public class sortingBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner ("System.in");
		int options;
		System.out.println("Enter size of an Array: ");
		int s = in.nextInt();
		int arr[] = new int[s];
		
		do {
			System.out.println("Menu: \n1. Bubble \n2. Insertion \n3. Selection \n4. Exit \nEnter: ");
			options = in.nextInt();
			System.out.println();
			
			switch (options) {
			case 1: 
			int swap = 0;
			System.out.println("Enter " + s + "number: ");
			for (int i = 0; i < s; i++) {
				arr[i] = in.nextInt();
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length -1; j++) {
					if (arr[j] > arr [j+1]) {
						swap = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = swap;
					}
					for(int k = 0; k < arr.length; k++) {
						System.out.println(arr[k] + "\t");
					}
					System.out.println();
				}
				System.out.println();
			}
			break;
			case 2: 
			System.out.println("Enter " + s + "number: ");
			for (int i = 0; i < s; i++) {
				arr[i] = in.nextInt();
			}
			for (int j = 1; j < arr.length; j++) {
				int key = arr[j];
				int i = j - 1;
				while ((i > -1) && (arr[i] > key)) {
					arr[i+1] = arr[i];
					i--;
				}
				arr[i+1] = key;
			}
			for (int k : arr) {
				System.out.println(k + " ");
			}
			System.out.println();
			break;
			case 3: 
			int min = 0, index = 0;
			System.out.println("Enter " + s + "number: ");
			for (int i = 0; i < s; i++) {
				arr[i] = in.nextInt();
			}
			for (int i = 0; i < arr.length - 1; i++) {
				min = arr[i];
				index = i;
				for (int j = i+1; j < arr.length; j++) {
					if (arr[j] < min) {
						min = arr [j];
						index = j;
					}
				}
				arr[index] = arr[i];
				arr[i] = min;
			}
			for (int i : arr) {
				System.out.println(i + " ");
			}
			System.out.println();
			break;
			}
		} 
		while (options != 4);
		System.out.println("Programmer's Name: Ben Joshua B. Solanor");
	}
}







































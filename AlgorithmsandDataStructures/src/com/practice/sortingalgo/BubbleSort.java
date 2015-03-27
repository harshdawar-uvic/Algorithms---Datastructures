package com.practice.sortingalgo;



/**
 * This is class to sort an array using the bubble sort algorithm.
 * Bubble sort has a time complexity of O(n ^ 2).
 * 
 * It can be executed by java BubbleSort 34 21 334 677 555
 * 
 * i.e. pass the array as a command line argument
 * 
 * @author hArsh
 *
 */
public class BubbleSort {

	private static String BLANK_SPACE = " ";

	
	private int[] sortArray(int[] array) {

		int temp = 0;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String args[]) {

		if (args.length == 0) {
			System.out.println("Please enter array to sort");
			System.exit(0);
		}

		try {

			int[] array = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				array[i] = Integer.parseInt(args[i]);
			}

			BubbleSort sorting = new BubbleSort();
			array = sorting.sortArray(array);

			System.out.println("Sorted Array : \n");

			for (int element : array) {
				System.out.print(BubbleSort.BLANK_SPACE + element
						+ BubbleSort.BLANK_SPACE);
			}

		} catch (NumberFormatException e) {
			System.out.println("Please enter inetegers for sorting");
			System.exit(-1);
		}

	}

}

package com.practice.sortingalgo;

/**
 * This is class to sort an array using the Selection Sort algorithm.
 * Selection sort has a time complexity of O(n ^ 2).
 * 
 * It can be executed by java SelectionSort 34 21 334 677 555
 * 
 * i.e. pass the array as a command line argument
 * 
 * @author hArsh
 *
 */
public class SelectionSort implements Sort {
	private static String BLANK_SPACE = " ";

	@Override
	public int[] sortArray(int[] array) {
		int smallest = 0;
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			smallest = array[i];
			for (int j = i; j < array.length; j++) {
				if (array[j] < smallest) {
					smallest = array[j];
					temp = array[i];
					array[i] = smallest;
					array[j] = temp;

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

			SelectionSort sorting = new SelectionSort();
			array = sorting.sortArray(array);

			System.out.println("Sorted Array : \n");

			for (int element : array) {
				System.out.print(SelectionSort.BLANK_SPACE + element
						+ SelectionSort.BLANK_SPACE);
			}

		} catch (NumberFormatException e) {
			System.out.println("Please enter inetegers for sorting");
			System.exit(-1);
		}

	}

}

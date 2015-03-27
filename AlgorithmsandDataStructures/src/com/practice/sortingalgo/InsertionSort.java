package com.practice.sortingalgo;

public class InsertionSort implements Sort {

	private static String BLANK_SPACE = " ";

	@Override
	public int[] sortArray(int[] array) {
		int temp, j = 0;
		for (int i = 0; i < array.length -1; i++) {
			temp = array[i];
			j = i - 1;

			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
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

			InsertionSort sorting = new InsertionSort();
			array = sorting.sortArray(array);

			System.out.println("Sorted Array : \n");

			for (int element : array) {
				System.out.print(InsertionSort.BLANK_SPACE + element
						+ InsertionSort.BLANK_SPACE);
			}

		} catch (NumberFormatException e) {
			System.out.println("Please enter inetegers for sorting");
			System.exit(-1);
		}

	}

}

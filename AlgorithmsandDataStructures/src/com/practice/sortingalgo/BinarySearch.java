package com.practice.sortingalgo;

/**
 * @author hArsh
 * 
 * This class exposes a public method which accepts an array and the search item.
 * Method used is recursion.
 */
public class BinarySearch {

	private int binarySearch(int sortedArray[], int startIndex, int endIndex, int searchItem) {
		
		int mid = (int)Math.floor((startIndex + endIndex)/2);
		//Base case
		if(searchItem == sortedArray[mid])
			return mid;
		
		if(searchItem > sortedArray[mid]) {
			startIndex = mid + 1;
			return binarySearch(sortedArray, startIndex, endIndex, searchItem );
		} else {
			endIndex = mid - 1 ;
			return binarySearch(sortedArray, startIndex, endIndex, searchItem );
		}	
		
	}
	
	
	
	/**
	 * 
	 * Binary Search
	 * 
	 * @param sortedArray
	 * @param searchItem
	 * @return returns an integer which is the index of the array where the element is found
	 * If the element is not found it returns -1
	 * 
	 * 
	 */
	public int binarySearch(int sortedArray[], int searchItem) {
		return binarySearch(sortedArray, 0, sortedArray.length -1, searchItem );
	}
	
	public static void main(String[] args) {
		
		int sortedArray[] = {2,6,9,33,55,65,78,98,99,564,876,999};
		int searchItem = 2;
		
		BinarySearch search = new BinarySearch();
		
		System.out.print("The search Item was found at position " + search.binarySearch(sortedArray, searchItem));
	
		
	}
	
}

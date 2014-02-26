package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] array) 
	{
		int cur;
		int a;
		for (int b = 1; b < array.length; b++) {
			cur = array[b];
			for (a = b-1; a >=0 && (array[a]<cur); a--) {
				array[a+1] = array[a];
			}
			array[a+1] = cur;
		}

		return array;
	}
}

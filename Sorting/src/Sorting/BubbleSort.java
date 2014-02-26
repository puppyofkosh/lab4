package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] array) {
		//TODO: S1 implements bubble sort
		
	    for (int i = 0; i < array.length - 1; i++)
		{
		    for (int c = 0; c < array.length - i - 1; c++)
			{
			    if (array[c] > array[c + 1])
				{
				    int tmp = array[c];
				    array[c] = array[c + 1];
				    array[c + 1] = tmp;
				}
			}
		}
	    return array;
	}
}

package sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {54, 1001, 19, 4, 28, 8, 6, 999, 500, 345};
		int[] sortedArray = new int[array.length];
		sortedArray = mergeSort(array);
		System.out.println(Arrays.toString(sortedArray));

	}
	
	public static int[] mergeSort(int[] array) {
		if (array.length <= 1) { return array; }
		
		int mid = array.length / 2;
		int[] arrayOne = Arrays.copyOfRange(array, 0, mid);
		int[] arrayTwo = Arrays.copyOfRange(array, mid, array.length);
		
		arrayOne = mergeSort(arrayOne);
		arrayTwo = mergeSort(arrayTwo);
		
		return merge(arrayOne, arrayTwo);
	}
	
	public static int[] merge(int[] arrayOne, int[] arrayTwo) {
		int[] mergedArray = new int[arrayOne.length + arrayTwo.length];
		
		int indexOne = 0;
		int indexTwo = 0;
		
		while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
			if (arrayOne[indexOne] < arrayTwo[indexTwo]) {
				mergedArray[indexOne + indexTwo] = arrayOne[indexOne];
				indexOne++;
			} else {
				mergedArray[indexOne + indexTwo] = arrayTwo[indexTwo];
				indexTwo++;
			}
		}
		
		while (indexOne < arrayOne.length) {
			mergedArray[indexOne + indexTwo] = arrayOne[indexOne];
			indexOne++;
		}
		
		while (indexTwo < arrayTwo.length) {
			mergedArray[indexOne + indexTwo] = arrayTwo[indexTwo];
			indexTwo++;
		}
		
		return mergedArray;
	}

}

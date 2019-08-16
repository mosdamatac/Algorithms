package sort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {54, 1001, 19, 4, 28, 8, 6, 999, 500, 345};
		int[] sortedArray = new int[array.length];
		sortedArray = MergeSort.mergeSort(array);
		System.out.println(Arrays.toString(sortedArray));

	}

}

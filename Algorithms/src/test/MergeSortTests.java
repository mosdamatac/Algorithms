package test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import sort.MergeSort;

public class MergeSortTests {
	
	@Test
	public void sort_SortedArray_ReturnsTheSameArray() {
		final int[] array = {1, 5, 11, 15, 28};
		final int[] expected = {1, 5, 11, 15, 28};
		
		final int[] actual = MergeSort.sort(array);
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void sort_UnsortedArray_ReturnsSortedArray() {
		final int[] array = {54, 1001, 19, 4, -28, 8, 6, -999};
		final int[] expected = {-999, -28, 4, 6, 8, 19, 54, 1001};
		
		final int[] actual = MergeSort.sort(array);
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void sort_EmptyArray_ReturnsTheSameEmptyArray() {
		final int[] array = {};
		final int[] expected = {};
		
		final int[] actual = MergeSort.sort(array);
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void sort_NullArray_ReturnsIllegalArgumentException() {
		final int[] array = null;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			MergeSort.sort(array);
		});		
	}
	
	@Test
	public void sort_OneElement_ReturnsTheSameArray() {
		final int[] array = {5};
		final int[] expected = {5};
		
		final int[] actual = MergeSort.sort(array);
		
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void sort_TheSameNumbers_ReturnsTheSameArray() {
		final int[] array = {1, 1, 1, 1, 1};
		final int[] expected = {1, 1, 1, 1, 1};
		
		final int[] actual = MergeSort.sort(array);
		
		Assert.assertArrayEquals(expected, actual);
	}
}

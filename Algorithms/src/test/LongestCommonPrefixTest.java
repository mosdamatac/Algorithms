package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import problems.LongestCommonPrefix;

public class LongestCommonPrefixTest {
	private LongestCommonPrefix lcp = new LongestCommonPrefix();
	
	@Test
	public void longestCommonPrefix_EmptyArray_ReturnsEmptyString() {
		final String[] array = {};
		final String expected = "";
		
		final String actual = lcp.longestCommonPrefix(array);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void longestCommonPrefix_StringArrayVaryingLengths_ReturnsCommonPrefix() {
		final String[] array = {"flower", "flow", "flight"};
		final String expected = "fl";
		
		final String actual = lcp.longestCommonPrefix(array);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void longestCommonPrefix_StringArraySameStrings_ReturnsCommonPrefix() {
		final String[] array = {"mara", "mara", "mara"};
		final String expected = "mara";
		
		final String actual = lcp.longestCommonPrefix(array);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void longestCommonPrefix_StringArrayVaryingLengths_ReturnsEmptyString() {
		final String[] array = {"mara", "olivia", "damatac"};
		final String expected = "";
		
		final String actual = lcp.longestCommonPrefix(array);
		
		Assert.assertEquals(expected, actual);
	}
}

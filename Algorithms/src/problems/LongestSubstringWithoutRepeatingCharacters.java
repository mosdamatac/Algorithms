package problems;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "dvdabc";
		int result = lengthOfLongestSubstring(s);
		System.out.println("result: " + result);
	}
	
	public static int lengthOfLongestSubstring(String s) {
		 // tempSet and longestSet
        // create a set for substring -- add method returns boolean: if element is in the set or not
        // for i -> s.length() - 1
        // if (!tempSet.add(e))
            // longestSet = (tempSet.size() > longest.Size()) ? tempSet : longestSet;
            // tempSet.clear()
            // tempSet.add(e)
        // longestSet = (tempSet.size() > longest.Size()) ? tempSet : longestSet;
        // return longestSet        
        Set<Character> visitedCharacter = new HashSet<>();
        int longest = 0;
        
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!visitedCharacter.add(s.charAt(i))) {
                longest = (visitedCharacter.size() > longest) ? visitedCharacter.size() : longest;
                visitedCharacter.clear();
                start++;
                i = start;
                visitedCharacter.add(s.charAt(start));
            }
        }
        
        longest = (visitedCharacter.size() > longest) ? visitedCharacter.size() : longest;
        return longest;
    }

}

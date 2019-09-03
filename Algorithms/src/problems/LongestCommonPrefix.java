package problems;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) { return ""; }
        
        int min = Arrays.asList(strs)
            .stream().map(String::length).min(Integer::compareTo).get();
        String commonPrefix = "";
        for (int i = 0; i < min; i++) {
            for (int k = 1; k < strs.length; k++) {
                if (strs[k-1].charAt(i) != strs[k].charAt(i)) {
                    return commonPrefix;
                }
            }
            commonPrefix += Character.toString(strs[0].charAt(i));
        }
        
        return commonPrefix;
    }

}

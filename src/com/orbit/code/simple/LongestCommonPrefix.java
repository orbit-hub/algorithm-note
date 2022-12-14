package com.orbit.code.simple;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null||strs.length == 0) return "";
        int n = strs.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c){
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}

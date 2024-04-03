package com.trishan.strings.program;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Trishan";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s){
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < s.length() / 2; i++) {
            builder.setCharAt(i, s.charAt(s.length() - 1 - i));
            builder.setCharAt(s.length() - 1 - i, s.charAt(i));
        }
        return builder.toString();
    }
}

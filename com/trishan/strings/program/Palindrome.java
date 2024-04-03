package com.trishan.strings.program;

public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
        s = "raceacar";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s){
        // Using while loop
//        int start = 0;
//        int end = s.length() - 1;
//        while(start <= end) {
//            if (s.charAt(start) != s.charAt(end)){
//               return false;
//            }
//            start++;
//            end--;
//        }
//        return true;

        // Using for loop
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

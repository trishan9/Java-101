package com.trishan.strings.leetcode;

// Link: https://leetcode.com/problems/string-compression/description/

class Compression {
    public int compress(char[] chars) {
        char curCh = chars[0];
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == curCh) {
                count++;
            } else {
                builder.append(curCh);
                if (count > 1) {
                    builder.append(count);
                }
                curCh = chars[i];
                count = 1;
                continue;
            }
        }
        builder.append(curCh);
        if (count > 1) {
            builder.append(count);
        }

        char[] compressedChars = builder.toString().toCharArray();
        System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);

        return builder.length();
    }
}
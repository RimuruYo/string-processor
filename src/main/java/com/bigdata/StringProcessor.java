package com.bigdata;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringProcessor {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(countCharacterFrequency("character"));
    }

    public static Map<Character,Integer> countCharacterFrequency(String str){
        if (str == null) {
            return null;
        }

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }

    public static String reverseString(String str){
        // 边界检查
        if (str == null || str.isEmpty()) {
            return str;
        }
        // 双指针反转
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}

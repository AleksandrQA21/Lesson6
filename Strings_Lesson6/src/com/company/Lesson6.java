package com.company;

public class Lesson6 {
    public static void main(String[] args) {
        String s = "Some Text String";
        String s1 = "sometextstring";

        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.trim());
        System.out.println(s.toLowerCase());
    }
}

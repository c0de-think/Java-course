package com.c0dethink;

public class passbyValues {
    public static void main(String[] args) {
        int age = 18;
        int age2 = age;
        age = 20;
        System.out.println(age);
        System.out.println(age2);
    }
}

package com.c0dethink;

public class usedGetterClass {
    public static void main(String[] args) {
        Getter g1 = new Getter("");
        g1.setName("first");
        System.out.println(g1.getName());

        Getter g2 = new Getter("second");
        System.out.println(g2.getName());

        System.out.println(g1.equals(g2));
    }
}

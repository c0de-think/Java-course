package com.c0dethink;

import java.awt.*;

public class passbyValuesWithReference {
    public static void main(String[] args) {

        Point pointA = new Point(100, 100);
//        only one object here
        Point pointB = pointA;

        System.out.println(pointA);
        System.out.println(pointB);

//        there are two objects here
        pointB = new Point(100, 20);
        pointB.x = 20;
        System.out.println(pointA);
        System.out.println(pointB);


    }
}

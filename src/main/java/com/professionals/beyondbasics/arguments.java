package com.professionals.beyondbasics;

import java.util.Arrays;

public class arguments {
    public static void main(String[] args) {
        if (args.length > 0) {
//            show the arguments
            System.out.println(Arrays.toString(args));
        }
    }
}

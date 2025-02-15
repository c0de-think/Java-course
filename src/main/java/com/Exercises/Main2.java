package com.Exercises;

import java.math.BigDecimal;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {

        Location address = new Location(
                "US",
                "New York",
                111222
        );

        BigDecimal money = new BigDecimal("100.00");

        Laptop hp = new Laptop(
                "HP",
                new Date("2019/12/01")
        );

        Laptop[] laptops = new Laptop[] { hp };

        Person c0dethink = new Person(
                "c0dethink",
                18,
                "male",
                address,
                money,
                laptops
        );

        System.out.println(c0dethink);
    }
}
package com.Exercises;

import java.math.BigDecimal;
import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String gender;
    private Location location;
    BigDecimal money;
    private Laptop[] Laptops;

    public Person(String name, int age, String gender, Location location, BigDecimal money, Laptop[] laptops) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.money = money;
        Laptops = laptops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Laptop[] getLaptops() {
        return Laptops;
    }

    public void setLaptops(Laptop[] laptops) {
        Laptops = laptops;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", location=" + location +
                ", money=" + money +
                ", Laptops=" + Arrays.toString(Laptops) +
                '}';
    }
}

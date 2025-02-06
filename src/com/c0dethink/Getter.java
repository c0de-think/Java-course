package com.c0dethink;

import java.util.Objects;

public class Getter {
    private String name;
//TIP you should never write these code by yourself!
//    public Getter(String name)
//    {
//        this.name = name;
//    }
//
//    public void SetName(String name) {
//        this.name = name;
//    }
//
//    public String GetName() {
//        return this.name;
//    }


    public Getter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Getter getter = (Getter) o;
        return Objects.equals(name, getter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

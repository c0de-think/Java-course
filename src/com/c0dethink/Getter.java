package com.c0dethink;

public class Getter {
    private String name;

    public Getter(String name)
    {
        this.name = name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }
}

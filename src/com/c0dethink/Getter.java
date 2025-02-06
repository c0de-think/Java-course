package com.c0dethink;

import java.util.Objects;

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

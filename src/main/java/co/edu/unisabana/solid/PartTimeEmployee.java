package com.example.demo.unsolid;

public class PartTimeEmployee extends Employee {
    @Override
    public String getName() {
        throw new UnsupportedOperationException();
    }
}

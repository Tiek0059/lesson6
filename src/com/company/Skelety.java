package com.company;

public class Skelety extends Boss{
    private int strely;
    

    public int getStrely() {
        return strely;
    }

    @Override
    public String printInfo() {
        return "strely "+ getStrely();
    }
}

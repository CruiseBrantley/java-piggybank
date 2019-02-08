package com.lambdaschool;

public class AbstractMoney
{
    private double value;
    private int count;

    AbstractMoney(int count, double value)
    {
        this.count += count;
        this.value = value;
    }

    public double getValue()
    {
        return value;
    }

    public int getCount()
    {
        return count;
    }
}

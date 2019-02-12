package com.lambdaschool;

public class Penny extends AbstractMoney
{
    public Penny()
    {
        super(1, .01);
    }

    public Penny(int count)
    {
        super(count, .01);
    }

    @Override
    public String toString()
    {
        return this.getCount() > 1 ? this.getCount() + " Pennies" : this.getCount() + " Penny";
    }
}
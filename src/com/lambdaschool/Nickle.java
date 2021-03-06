package com.lambdaschool;

public class Nickle extends AbstractMoney
{
    public Nickle()
    {
        super(1, .05);
    }

    public Nickle(int count)
    {
        super(count, .05);
    }

    @Override
    public String toString()
    {
        return this.getCount() > 1 ? this.getCount() + " Nickels" : this.getCount() + " Nickel";
    }
}

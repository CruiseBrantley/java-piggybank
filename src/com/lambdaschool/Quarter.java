package com.lambdaschool;

public class Quarter extends AbstractMoney
{
    public Quarter()
    {
        super(1, .25);
    }

    public Quarter(int count)
    {
        super(count, .25);
    }

    @Override
    public String toString()
    {
        return this.getCount() > 1 ? this.getCount() + " Quarters" : this.getCount() + " Quarter";
    }
}

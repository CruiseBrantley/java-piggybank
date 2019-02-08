package com.lambdaschool;

public class Dollar extends AbstractMoney
{
    public Dollar()
    {
        super(1, 1.00);
    }

    public Dollar(int count)
    {
        super(count, 1.00);
    }

    @Override
    public String toString()
    {
        return "$" + this.getCount();
    }
}
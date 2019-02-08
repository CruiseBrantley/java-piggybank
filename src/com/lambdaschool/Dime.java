package com.lambdaschool;

public class Dime extends AbstractMoney
{
    public Dime()
    {
        super(1, .10);
    }

    public Dime(int count)
    {
        super(count, .10);
    }

    @Override
    public String toString()
    {
        return this.getCount() > 1 ? this.getCount() + " Dimes" : this.getCount() + " Dime";
    }
}

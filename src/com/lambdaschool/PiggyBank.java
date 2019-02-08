package com.lambdaschool;

public class PiggyBank
{
    private AbstractMoney[] store = new AbstractMoney[1000];
    private int storeIndex = 0;
    private double currentValue = 0;

    public void add(AbstractMoney item)
    {
        store[storeIndex] = item;
        currentValue += item.getValue() * item.getCount();
        storeIndex++;
    }

    public void printContents()
    {
        for (int i = 1; i <= storeIndex; i++)
        {
            System.out.println(store[i - 1].toString());
        }
    }

    public void printValue()
    {
        System.out.println("The piggy bank holds $" + String.format("%.02f", currentValue));
    }
}

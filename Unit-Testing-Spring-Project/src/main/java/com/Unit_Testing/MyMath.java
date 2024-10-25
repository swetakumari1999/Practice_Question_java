package com.Unit_Testing;

public class MyMath
{
    public int calculateSum(int[] numbers)
    {
        int sum =0;
        for (int i:numbers)
        {
            sum +=i;
        }
        return sum;
    }
}

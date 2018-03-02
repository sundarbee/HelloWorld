package com.getmorph.com.myutils;

/**
 * Created by sundar on 2/3/18.
 */

public class MyMath {
    public static int Plus(int a, int b)
    {
        return a+b;
    }

    public static int Minus(int a, int b)
    {
        return a-b;
    }

    public static int Mul(int a, int b)
    {
        return a*b;
    }

    public static float Div(int a, int b)
    {
        if(b ==0)
            throw new IllegalArgumentException("Div by zero error");
        else
            return a/b;
    }
}

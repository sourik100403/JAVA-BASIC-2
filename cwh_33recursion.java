package com.company;

public class cwh_33recursion {
    static int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else
        {
           return n*factorial(n-1);

        }
    }
    static int fact_for(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else
        {
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            return fact;
        }

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("factorial of 5="+factorial(n));
        System.out.println("factorial of 5="+fact_for(n));
    }
}

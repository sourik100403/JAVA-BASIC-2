package com.company;

public class multipletable {
//    static void multiple(int n)
//    {
//        for(int i=1;i<=10;i++)
//        {
//            System.out.format("%d x %d = %d\n",n,i,n*i);
//        }
//    }
//    static void star(int n)
//    {
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<i+1;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    static void sum(int n)
//    {
//        int sum=0;
//        for(int i=1;i<=n;i++)
//        {
//            sum=sum+i;
//        }
//        System.out.println(sum);
//    }
//    static int sumrec(int n)
//    {
//        if(n==1)
//        {
//            return 1;
//        }
//        else
//        {
//            return n+sumrec(n-1);
//        }
//    }
//    static int fib(int n) {
//        if (n == 1)
//        {
//            return 0;
//        }
//        else if (n==2)
//        {
//            return 1;
//        }
//        else
//        {
//            return fib(n-1)+fib(n-2);
//        }
//    }
    static void revstar(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//     multiple(7);
//     star(6);
//     sum(10);
//     System.out.println(sumrec(10));
//     System.out.println(fib(10));
     revstar(4);
    }
}

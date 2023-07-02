package com.company;
import java.util.Scanner;
public class input_basic {
    public static void main(String[] args) {
//        System.out.println("input number by user and get result");
//        Scanner obj=new Scanner(System.in);
//        System.out.println("enter your name");
//        String Name=obj.nextLine();
//        System.out.println(Name);
        System.out.println("add two number");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        float a=sc.nextFloat();
        System.out.println("enter 2nd number");
        float b=sc.nextFloat();
        float c=a+b;
        System.out.println("sum ="+c);


    }
}

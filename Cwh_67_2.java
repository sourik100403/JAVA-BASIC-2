package com.company;
import java.util.Scanner;
class Display
{
    void show(String a)
    {
        System.out.println(a);
    }
}
public class Cwh_67_2 {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter any paragraph");
        String a=obj1.nextLine();
        Display obj=new Display();
        obj.show(a);

    }
}

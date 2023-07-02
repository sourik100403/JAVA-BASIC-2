package com.company;
class MyNewEmployee
{
    int id;
    String name;
    MyNewEmployee()
    {
        System.out.println("this is derfalult constructor");
    }
    MyNewEmployee(int n)
    {
        id=n;
    }
    MyNewEmployee(String n)
    {
        name=n;
    }
    MyNewEmployee(int n,String x)
    {
        System.out.println(n);
        System.out.println(x);
    }
}

public class cwh_42_constractor {
    public static void main(String[] args) {
        MyNewEmployee sourik=new MyNewEmployee();
        MyNewEmployee sourik1=new MyNewEmployee(87286);
        MyNewEmployee sourik2=new MyNewEmployee("harry");
        MyNewEmployee sourik3=new MyNewEmployee(98787,"suraj");
        System.out.println(sourik1.id);
        System.out.println(sourik2.name);

    }
}

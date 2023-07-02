package com.company;
class Base11
{
    Base11()
    {
        System.out.println("this is constractor of base class");
    }
    Base11(int x)
    {
        System.out.println("this is a parameter base class with value="+x);
    }
}
class Derived11 extends Base11
{
    Derived11()
    {
        System.out.println("this is a derived constractor without parameter");
    }
    Derived11(int x,int y)
    {
        super(x);
        System.out.println("this is derived parameter class value of y="+y);
    }
}
class GrandDerived extends Derived11
{
    GrandDerived()
    {
        System.out.println("this is a grandderived without parameter constractor");
    }
    GrandDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("the value of grandchild class z="+z);
    }
}

public class cwh_46_constractor_overloading {
    public static void main(String[] args) {
//        Base11 b=new Base11();
//        Derived11 d1=new Derived11();
//        Base11 b1=new Base11(6);
//        Derived11 d=new Derived11(10,12);
        GrandDerived gd1=new GrandDerived();
        GrandDerived gd=new GrandDerived(10,12,13);
    }
}

package com.company;
abstract class abst
{
    void show()
    {
        System.out.println("this is show method");
    }
    abstract void tune();
}
class free extends abst
{
    @Override
    void tune()
    {
        System.out.println("this is tune method");
    }
}
class free2 extends abst
{
    void show1()
    {
        System.out.println("it is free2 show");
    }
    void tune()
    {
        System.out.println("this is tune of free2");
    }

}

public class abstrctmethod {
    public static void main(String[] args) {
        free obj=new free();
        free2 obj1=new free2();
        obj.tune();
        obj.show();
        obj1.show1();
        obj1.show();
        obj1.tune();

    }
}

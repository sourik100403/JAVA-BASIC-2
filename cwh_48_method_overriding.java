package com.company;
class Over
{
    public void show()
    {
        System.out.println("this is over class show without parameter method");
    }
    public int show(int x)
    {
        return x;
    }
}
class Low extends Over
{
    @Override
    public void show()
    {
        System.out.println("this is low class show without parameter method");
    }
    @Override
    public int show(int x)
    {
        return x+9;
    }
}

public class cwh_48_method_overriding {
    public static void main(String[] args) {
        Over ob=new Over();
        Low ob1=new Low();
        ob.show();
        System.out.println(ob.show(6));
        ob1.show();
        System.out.println(ob1.show(9));
        System.out.println(ob.show(9));
    }
}

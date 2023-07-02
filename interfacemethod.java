package com.company;
interface interfa
{
    void show();
    void show1();
}
interface out
{
    void out();
}
class intero implements interfa,out
{
   public void show()
    {
        System.out.println("this is show method");
    }
    public void show1()
    {
        System.out.println("this is show1 method");
    }
    public void out()
    {
        System.out.println("this is out method in out class");
    }
}
public class interfacemethod {
    public static void main(String[] args) {
        intero obj=new intero();
        obj.out();
        obj.show();
        obj.show1();
    }
}

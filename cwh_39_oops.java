package com.company;
//1
class Employee
{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setname(String n)
    {
        name=n;
    }
    //2
}
class Call
{
    public void ring()
    {
        System.out.println("ringing......");
    }
    public void vibrate()
    {
        System.out.println("vibrateting now.....");
    }
    public void call()
    {
        System.out.println("calling sourik.....");
    }
}
class Square
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
class Rectangle
{
    int height;
    int width;
    Rectangle(int h,int w)
    {
        height=h;
        width=w;
    }
    public int area()
    {
        return height*width;
    }
    public int perimeter()
    {
        return 2*(height+width);
    }
}


public class cwh_39_oops {
    public static void main(String[] args) {
        //1
//        Employee obj=new Employee();
//        obj.name="sourik";
//        obj.salary=88988;
//        System.out.println(obj.getSalary());
//        System.out.println(obj.getName());
//        obj.setname("suraj");



        //2
//        Call obj=new Call();
//        obj.ring();
//        obj.vibrate();
//        obj.call();



        //3
//        Square obj=new Square();
//        obj.side=10;
//        System.out.println(obj.area());
//        System.out.println(obj.perimeter());



        //4
        Rectangle obj=new Rectangle(10,5);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());

    }
}

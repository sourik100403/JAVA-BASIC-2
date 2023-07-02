package com.company;
class Room1
{
    int length,breath;
    Room1(int l,int b)
    {
        length=l;
        breath=b;
    }
    int area()
    {
        return (length*breath);
    }
}
class Bedroom1 extends Room1
{
    int height;
    Bedroom1(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    int volume()
    {
        return (length*breath*height);
    }
}
public class inheritance__2 {
    public static void main(String[] args) {
        Room1 obj=new Room1(10,20);
        int aarea=obj.area();
        Bedroom1 obj1=new Bedroom1(10,20,30);
        int avolume=obj1.volume();
        System.out.println(aarea);
        System.out.println(avolume);
    }
}

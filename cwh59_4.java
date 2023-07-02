package com.company;
interface TvRemote
{
    void tell();
}
interface SmartTvRemote extends TvRemote
{
    void off();
}
class Tv implements SmartTvRemote
{
    public void off()
    {
        System.out.println("now your tv is off");
    }
    public void tell()
    {
        System.out.println("now your tv is on");
    }
}
public class cwh59_4 {
    public static void main(String[] args) {
        Tv obj=new Tv();
        obj.off();
        obj.tell();
        TvRemote ob=new Tv();
        ob.tell();
        SmartTvRemote ob1=new Tv();
        ob1.off();
        ob1.tell();

    }
}

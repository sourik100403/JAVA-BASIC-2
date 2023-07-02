package com.company;
class Phone
{
    public void showTime()
    {
        System.out.println("now time is 8pm.......");
    }
    public void on()
    {
        System.out.println("phone is on");
    }
}
class SmartPhone extends Phone
{
    public void music()
    {
        System.out.println("play music on smartphone");
    }
    public void on()
    {
        System.out.println("smartphone is on");
    }
}

public class cwh_49_runtimepollymorphijam {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();
        obj.showTime();
        obj.on();

    }
}

package com.company;
abstract class Pen
{
    abstract void write();
     abstract void refile();
}
class FoundationPen extends Pen
{

    @Override
    void write()
    {
        System.out.println("write");
    }

    @Override
    void refile() {
        System.out.println("refile");
    }
    void changeNib()
    {
        System.out.println("change the nib ");
    }
}
class Monkey
{
    void jump()
    {
        System.out.println("junp method in monkey");
    }
    void bite()
    {
        System.out.println("bite in monkey method");
    }
}
interface BasicAnimal
{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    void speek()
    {
        System.out.println("hello sir!");
    }
    public void eat()
    {
        System.out.println("this is eat method");
    }
    public void sleep()
    {
        System.out.println("this is sleep method");
    }
}
abstract class Telephone
{
    abstract void ring(long n);
    abstract void lift();
    abstract void disconnect();
    void print()
    {
        System.out.println("this is telephone");
    }
}
class SmartPhone1 extends Telephone
{
    void ring(long n)
    {
        System.out.println("ring "+n);
    }
    void lift()
    {
        System.out.println("lift");
    }
    void disconnect()
    {
        System.out.println("call disconnect");
    }
}
public class cwh_59_abstratct {
    public static void main(String[] args) {
        //quedstion 1
        FoundationPen obj=new FoundationPen();
        obj.changeNib();
        obj.write();
        obj.refile();


        //question 2
        Monkey obj1=new Monkey();
        Human obj2=new Human();
        obj2.eat();
        obj2.sleep();
        obj1.bite();
        obj1.jump();
        obj2.bite();
        obj2.jump();
        Monkey m=new Human();
//        m.speek();//error
        BasicAnimal love=new Human();
//        love.speek();//error

        //q4



    }
}

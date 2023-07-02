package com.company;
class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea()
    {
        return 2*Math.PI*radius*height+2*Math.PI *radius*radius;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
}


class Rectangle43
{
    private int length;
    private int breadth;
    Rectangle43()
    {
        length=5;
        breadth=4;
    }
    Rectangle43(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }
}

    public class cwh_44_geter_setter {
        public static void main(String[] args) {
            Cylinder ob=new Cylinder(12,10);
//            ob.setRadius(12);
//            int h=ob.getRadius();
//            System.out.println(h);
//            ob.setHeight(10);
//            int r=ob.getHeight();
//            System.out.println(r);
            //problem2
            System.out.println(ob.surfaceArea());
            System.out.println(ob.volume());
            //problem 3
            Rectangle43 myRectangle=new Rectangle43(12,10);
            System.out.println(myRectangle.getBreadth());
            System.out.println(myRectangle.getLength());
        }
    }

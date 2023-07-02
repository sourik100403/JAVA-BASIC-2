package com.company;
class Rectangle10
{
    int length,height,width;
    Rectangle10(int l,int h,int w)
    {
        this.length=l;
        this.height=h;
        this.width=w;
    }
    int volumeRec()
    {
        return this.length*this.height*this.width;
    }
    int surfaceRec()
    {
        return this.width*this.height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
class Square10
{
    public final float PI=3.14f;
    int radious;
    Square10(int r)
    {
        this.radious=r;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    float squareArea()
    {
        return 4*PI*this.radious*this.radious;
    }

}
class Circle10
{
    int radious;
    Circle10(int r)
    {
        this.radious=r;
    }
    double volumeCircle()
    {
        return (4/3*3.14*this.radious*this.radious*this.radious);
    }
    double areaCircle()
    {
        return 3.14*radious*radious;
    }
}
//class Cylinder10 extends Rectangle10
//{
//    int radious;
//    Cylinder10()
//    {
//
//        radious=r;
//
//    }
//
//}
//class Sphere10
//{
//
//}
public class Cwh_68 {
    public static void main(String[] args) {
        Rectangle10 obj=new Rectangle10(10,10,10);
        System.out.println(obj.surfaceRec());
        System.out.println(obj.volumeRec());
        Square10 obj1=new Square10(10);
        System.out.println(obj1.squareArea());
        Circle10 obj2=new Circle10(10);
        System.out.println(obj2.areaCircle());
        System.out.println(obj2.volumeCircle());
    }
}

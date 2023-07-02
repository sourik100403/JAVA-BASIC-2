package com.company;
class MyEmployee
{
    private int id;
    private String name;
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String n)
    {
        this.name=n;
    }
}

public class cwh_40_getter {
    public static void main(String[] args) {
        MyEmployee sourik=new MyEmployee();
        sourik.setName("sourik");
        System.out.println(sourik.getName());
        sourik.setId(787);
        System.out.println(sourik.getId());
    }
}

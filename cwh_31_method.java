package com.company;

public class cwh_31_method {
    static int add(int x,int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else{
            z=x-y;
        }
        return z;
    }
    public static void main(String[] args) {
        int c=add(7,9);
        System.out.println(c);
        //creating object
//        int c;
//        cwh_31_method obj=new cwh_31_method();
//        c=obj.add(8,7);
//        System.out.println(c);
    }
}

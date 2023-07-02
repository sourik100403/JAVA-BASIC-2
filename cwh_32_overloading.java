package com.company;

public class cwh_32_overloading {
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int a){
        System.out.println("good morning "+ a);
    }
    static void foo(int a,int b){
        System.out.println("good morning "+a);
        System.out.println("good morning "+b);
    }
    public static void main(String[] args) {
        foo();
        foo(300);
        foo(3000,4000);

    }
}

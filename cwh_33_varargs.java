package com.company;

public class cwh_33_varargs {
    static int sum(int a,int ...arr){
        int result=0;
        for (int e:arr) {
            result+=e;
        }
        return result+a;
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,7));

    }
}

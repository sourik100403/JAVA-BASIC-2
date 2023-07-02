package com.company;
import java.util.Scanner;
public class cwh_12_practice {
    public static void main(String[] args) {
        //1
//        float a=7/4f *9/2f;
//        System.out.println(a);

        //2
        char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);
//        //decrypt
        grade=(char)(grade-8);
        System.out.println(grade);

        //3
        Scanner sc=new Scanner(System.in);
        System.out.println("enter yuour num::");
        int a=sc.nextInt();
        System.out.println(a>=9);

        //4
//        int v=3;
//        int u=2;
//        int a=1;
//        int s=5;
//        int ans=(v*v-u*u)/2*a*s;
//        System.out.println(ans);

    }
}

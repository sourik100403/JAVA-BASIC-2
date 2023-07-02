package com.company;
import java.util.Scanner;

public class video_06_cwh {
    public static void main(String[] args) {
        System.out.println("everyone given your marks out of 100 ");
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your bengali markes:");
        int ben=obj.nextInt();
        System.out.println("enter your english markes:");
        int eng=obj.nextInt();
        System.out.println("enter your phy markes:");
        int phy=obj.nextInt();
        System.out.println("enter your chem markes:");
        int chem=obj.nextInt();
        System.out.println("enter your math markes:");
        int math=obj.nextInt();
        int percentage=(ben+eng+phy+chem+math)/5;
        System.out.println("the percentage of your exam"+percentage);
    }
}

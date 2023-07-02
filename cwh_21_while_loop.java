package com.company;
import java.util.Scanner;

public class cwh_21_while_loop {
    public static void main(String[] args) {
        System.out.println("print 1 to 100 odd or even number");
        System.out.println("enter your choice::odd or even");
        Scanner ob=new Scanner(System.in);
        String choice=ob.nextLine();
        int i=1;
            switch (choice){
                case "odd": {
                    while (i <= 100) {
                        if (i % 2 != 0) {
                            System.out.println(i);
                            i++;
                        }
                    }
                    break;
                }
                case "even": {
                    while (i <= 100) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                            i++;
                        }
                    }
                    break;
                }
                default:
                    System.out.println("enter odd or even");
            }
        }
    }

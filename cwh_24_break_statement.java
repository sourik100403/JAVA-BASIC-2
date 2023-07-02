package com.company;

public class cwh_24_break_statement {
    public static void main(String[] args) {
        //for loop
//        for(int i=0;i<=5;i++){
//            System.out.println("print all number ");
//            System.out.println(i);
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//            }
//        }

        //while
        int i=0;
        while(i<5){
            System.out.println("print all number ");
            System.out.println(i);
            if(i==3){
                System.out.println("ending the loop");
                break;
            }
            i++;
        }

        //do while
//        int i=0;
//        do{
//            System.out.println("print all number ");
//            System.out.println(i);
//            if(i==4){
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("all done");
    }
}

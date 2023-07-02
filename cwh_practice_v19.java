package com.company;
import java.util.Scanner;
import java.util.Random;

public class cwh_practice_v19 {
    public static void main(String[] args) {
        //2 nd problem
//        System.out.println("****  this is your result here below  *******");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your name:");
//        String name=sc.nextLine();
//        System.out.println("Enter your roll number:");
//        long Roll=sc.nextInt();
//        System.out.println("Enter your phy number :");
//        Integer phy=sc.nextInt();
//        System.out.println("Enter your chem number :");
//        Integer chem=sc.nextInt();
//        System.out.println("Enter your math number :");
//        Integer math=sc.nextInt();
//        float avg=(phy+math+chem)/3.0f;
//        System.out.println("overall percentage ::"+avg);
//        System.out.println("your roll :"+Roll);
//        if(avg>40 && phy>33 && chem>33 && math>33){
//            System.out.println(name+" you have successfull pass all subject , you are promoted");
//        }
//        else{
//            System.out.println(name+ " you have unsuccessfull not pass all subject , you are fail");
//        }

        // 3rd problem
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your name:");
//        String name=sc.nextLine();
//        float tax=0;
//        System.out.println("enter yor annol income:");
//        float income=sc.nextFloat();
//        if(income<2.5f){
//            tax=tax+0;
//        }
//        else if(income>2.5f && income<=5.0f){
//            tax=tax+0.05f*(income-2.5f);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(income-5.0f);
//        }
//        else {
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.02f*(10.0f-5.0f);
//            tax=tax+0.03f*(income-10.0f);
//        }
//        System.out.println(name+ "your annaol income tax is:"+ tax);

        //4problem
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter any number betwwn 1 to 7");
//        int day=sc.nextInt();
//        switch (day){
//            case 1-> System.out.println("sunday");
//            case 2-> System.out.println("monday");
//            case 3-> System.out.println("tuesday");
//            case 4-> System.out.println("wednesday");
//            case 5-> System.out.println("thusday");
//            case 6-> System.out.println("friday");
//            case 7-> System.out.println("saturday");
//            default -> System.out.println("enter wrong number");
//        }
        //5 problem
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enterwebsite name");
//        String website=sc.nextLine();
//        if(website.endsWith(".org")){
//            System.out.println(website + " is a organigation website ");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println(website + " is a commercial website  ");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println(website + " is a indian website  ");
//        }
//        else{
//            System.out.println(website +"is other website");
//        }
        //6 problem
        //leap year
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter year ::");
//        Integer year=sc.nextInt();
//        if(((year%4==0) && (year%100!=0)) || (year%400==0)){
//            System.out.println(year +" is a leap year");
//        }
//        else{
//            System.out.println(year +" not a leap year");
//        }
        //random number generate
        Random ran=new Random();
        int number=ran.nextInt();
        float num1=ran.nextFloat();
        System.out.println(num1);
        System.out.println(number);






    }
}

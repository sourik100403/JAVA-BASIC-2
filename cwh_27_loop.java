package com.company;

public class cwh_27_loop {
    public static void main(String[] args) {
        int[] student_marks={65,87,98,45,90};
        System.out.println(student_marks.length);
        //using for loop
//        for(int i=0;i<student_marks.length;i++){
//            System.out.println(i+"="+student_marks[i]);
//        }
        //using for each loop
        for (int element:student_marks) {
            System.out.println(element);
        }
    }
}

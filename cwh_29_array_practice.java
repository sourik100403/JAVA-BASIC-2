package com.company;

public class cwh_29_array_practice {
    public static void main(String[] args) {

        //sum of 5 given float number
//        float[] flats={78.8f,87.5f,76f,67f,56.9f};
//        float sum=0;
//        for (float element:flats
//             ) {
//            sum=sum+element;
//        }
//        System.out.println("sum="+sum);

        //find number if present in array
//        int [] number={45,12,87,45,76,12};
//        int search=12;
//        boolean isAnArray=false;
//        for (int element:number) {
//            if(search==element){
//                isAnArray=true;
//                break;
//            }
//        }
//        if(isAnArray){
//            System.out.println("present in the arry");
//        }
//        else{
//            System.out.println("not present");
//        }


        //problem 3 average the all number in array
//        int [] marks={76,88,98,67,90};
//        int sum=0;
//        int avg=0;
//        for (int element:marks) {
//            sum=sum+element;
//        }
//        System.out.println("the average value of result is "+sum/marks.length);


        //4 probem add two matricx 2x3
//        int[][] matrices1={{1,2,3},{4,5,6}};
//        int[][] matrices2={{4,6,7},{9,3,2}};
//        int[][] result={{0,0,0},{0,0,0}};
//        for(int i=0;i<matrices1.length;i++){
//            for(int j=0;j<matrices1[i].length;j++){
//                System.out.format("the value of i=%d and j=%d \n",i,j);
//                result[i][j]=matrices1[i][j]+matrices2[i][j];
//            }
//        }
//        //for out put stor in matrices from
//        for(int i=0;i<matrices1.length;i++){
//            for(int j=0;j<matrices1[i].length;j++){
//                System.out.print(result[i][j]+" ");
//                result[i][j]=matrices1[i][j]+matrices2[i][j];
//            }
//            System.out.println("");
//        }

        //5 problem reverse the array
//        int [] num={12,13,14,15,16};
//        for(int i=num.length-1;i>=0;i--){
//            System.out.print(num[i]+" ");
//        }
        //5 problem another process
//        int [] arr={1,2,3,4,5,6};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for (int element:arr) {
//            System.out.print(element+" ");
//        }

//        //6 problem max number of an array
//        int [] arr={1,56,987,9};
//        int max=Integer.MIN_VALUE;
//        for(int e:arr){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println(max);


//        7 problem min number of an array
//        int [] arr={1,56,987,-1243,9};
//        int min=Integer.MAX_VALUE;
//        for(int e:arr){
//            if(e<min){
//                min=e;
//            }
//        }
//        System.out.println(min);


        //8 problem sorted array
        boolean isSorted=true;
        int [] arr={1,2,3,4,5,56};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }



    }
}

package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inpbuffer {
    public static void main(String[] args) throws IOException {
        int a;
        System.out.println("enter two number");
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String name=ob.readLine();
        a=Integer.parseInt(ob.readLine());
        System.out.println(a);
        System.out.println(name);
    }
}

package com.company;

public class cwh_15_practice {
    public static void main(String[] args) {
        String name="SOURIK PARUI";
        System.out.println(name.toLowerCase());
        //problem 2
        String undertline="sourik parui parabagnan";
        System.out.println(undertline.replace(' ', '_'));
        //problem 3
        String letter="Dear <|name|, thanks a lot>";
        letter = letter.replace("<|name|>","harry");
        System.out.println(letter);
    }
}

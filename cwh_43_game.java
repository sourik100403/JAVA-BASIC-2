package com.company;
import java.util.Scanner;
class Game {
    int userNumber;
    int compNumber;
    int counter = 0;

    public Game() {
        compNumber = (int) (Math.random() * 100);
        System.out.println(compNumber);
    }

    public void setNum(int n) {
        userNumber = n;
    }

    public int isCorrect() {
        if (userNumber > compNumber) return -1;
        else if (userNumber < compNumber) return 1;
        else return 0;
    }

    public void Counter() {
        counter++;
    }
}
    public class cwh_43_game {
        public static void main(String[] args) {
            Game obj = new Game();
            Scanner sc = new Scanner(System.in);
            int n = 0;
            while (true) {
                System.out.println("Enter a number between 1-100: ");
                n = sc.nextInt();
                obj.setNum(n);

                if (obj.isCorrect() == 0) {
                    obj.Counter();
                    if(obj.counter>10){
                        System.out.println("you exit your 10 try !!! try after some time");
                        System.exit(0);

                    }
                    System.out.println("succefully end the game");
                    System.out.println("Number of counts: " + (obj.counter));
                    break;
                }
                else if (obj.isCorrect() == -1) {
                    obj.Counter();
                    if(obj.counter>10){
                        System.out.println("you exit your 10 try !!! try after some time");
                        System.exit(0);

                    }
                    System.out.println("you have enter Higher number please enter lower number!");
                }
                else if (obj.isCorrect() == 1) {
                    obj.Counter();
                    if(obj.counter>10){
                        System.out.println("you exit your 10 try !!! try after some time");
                        System.exit(0);

                    }
                    System.out.println("you have enter Lower number please enter higher number!");
                }
            }
        }
    }

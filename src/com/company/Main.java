package com.company;

import javax.management.relation.Role;
import java.util.Scanner;

public class Main {

    /*
    * a program that get's the user input as a parameter for the random number generator
     */

    //global int
    static int userNumber = 0;

    public static void main(String[] args) {
        // write your code here
        System.out.println("enter a number below");

        // read the past line
        Scanner reader = new Scanner(System.in);
        userNumber = (int) reader.nextDouble();
        reader.nextLine();

        //call the fuction
        rollDie();
        int diceLocal = rollDie();

        //print it out
        System.out.println("the number that was created is");
        System.out.println(diceLocal);
    }

    public static int rollDie(){

        //do da math
        int dice = (int)(Math.random()*userNumber+1);

        //return it
        return dice;
    }
}

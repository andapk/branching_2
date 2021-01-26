package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
///Assignment No.1.6

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Striker", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Winger ", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Right-back ", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Goalkeeper ", position);


        // 7
        Scanner input = new Scanner(System.in);
        System.out.println("Write km/h:");
        double kilometresPerHour= input.nextDouble();
        System.out.println("Miles per hour is " + (toMilesPerHour(kilometresPerHour)));

    }
        static void displayHighScorePosition (String playersName,int position){
            System.out.println(playersName + " managed to get into position ");
            System.out.println(position + " on the high score table");

        }

        static int calculateHighScorePosition ( int playersScore){
            if (playersScore >= 1000) {
                return 1;
            } else if (playersScore >= 500) {
                return 2;
            } else if (playersScore >= 100) {
                return 3;
            } else {
                return 4;
            }
        }
        /*Assignment No.1.7
        Write a method called toMilesPerHour that has 1 parameter of type double with the name
    kilometersPerHour. This method needs to return the rounded value of the calculation of type long
    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return
            -1 to indicate an invalid value. Otherwise, if it is positive, calculate the value of miles per hour,
    round it and return it.*/
     static long toMilesPerHour (double kilometersPerHour){

         if (kilometersPerHour<0){
             return -1;
         }else {
             return (Math.round(kilometersPerHour * 0.621371192));
         }

     }





    }



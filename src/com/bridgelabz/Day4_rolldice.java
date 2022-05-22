package com.bridgelabz;

import java.util.Random;

public class Day4_rolldice {

        public static void main(String[] args) {

            int position = 0;
            System.out.println("Position of player = " + position);

            System.out.println("PLAYER1 ROLLS A DIE.....");
            System.out.println("*****************************************************************");

            Random random = new Random();
            int x1 = random.nextInt(7);
            System.out.println("The number on a die = " + x1);
        }


    }



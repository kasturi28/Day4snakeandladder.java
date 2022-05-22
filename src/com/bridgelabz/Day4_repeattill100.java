package com.bridgelabz;

public class Day4_repeattill100 {
        static int position = 0;
        public static final int SAME_POSITION = 0;
        public static final int LADDER = 1;
        public static final int SNAKE = 2;

        public static void main(String[] args) {
            System.out.println("Starting position of the player = " + position);

            while (position<100) {

            int dice = (int) ((Math.random()*10)%6+1);
            int check = (int) ((Math.random()*10)%3);
            switch (check) {
                case SAME_POSITION:
                    System.out.println("Player remains on the same position...");
                    break;
                case LADDER:
                    position = position + dice;
                    System.out.println("Player get ladder & positon of the player = " + position);
                    break;
                case SNAKE:
                    position = position - dice;
                    if (position < 0) {
                        position = 0;
                        System.out.println("Player get snake & positon of the player = " + position);
                    }
            }
            if (position > 100) {
                position = position - dice;
                System.out.println("Player remains on the same position = " + position);


            }



        }

    }

}

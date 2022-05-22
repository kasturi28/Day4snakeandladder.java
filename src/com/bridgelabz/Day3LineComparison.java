package com.bridgelabz;

import java.util.Random;

public class Day3LineComparison {

    public static void main(String[] args) {

        System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM ON MASTER  BRANCH");
        System.out.println("*****************************************************************");

        Random random = new Random();
        int x1 = random.nextInt( 10);
        int y1 = random.nextInt( 10);
        int x2 = random.nextInt( 10);
        int y2 = random.nextInt( 10);

        System.out.println("Coordinates x1 and y1 of first point is "+x1+", "+y1);
        System.out.println("Coordinates x2 and y2 of second point is "+x2+", "+y2);

        double length1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length pf line1 is "+length1);

        int x3 = random.nextInt( 10);
        int y3 = random.nextInt( 10);
        int x4 = random.nextInt( 10);
        int y4 = random.nextInt( 10);

        System.out.println("Coordinates x3 and y3 of third  point is "+x1+", "+y1);
        System.out.println("Coordinates x4 and y4 of fourth point is "+x1+", "+y1);

        double length2 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
        System.out.println("Length pf line2 is "+length2);

        Double f1 = Double.valueOf(length1);
        Double f2 = Double.valueOf(length2);

        if(f1.compareTo(f2) == 1) {
            System.out.println("Line1 is greater than Line2");
        } else if(f1.compareTo(f2) == -1){
            System.out.println("Line2 is greater than Line1");
        }
        else{
            System.out.println("Line1 and Line2 are equal");
        }



    }

}

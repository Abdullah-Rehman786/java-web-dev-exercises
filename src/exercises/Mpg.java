package exercises;

import java.util.Scanner;

public class Mpg {

        public static void main(String [] args){
            Scanner input = new Scanner(System.in);

            System.out.println("How many miles have you driven? ");
            Integer miles = input.nextInt();

            System.out.println("How many gallons did you use? ");
            Integer gallons = input.nextInt();

            Integer mpg = miles/gallons;

            System.out.println(String.format("Miles per gallon: %d",mpg));
        }
    }


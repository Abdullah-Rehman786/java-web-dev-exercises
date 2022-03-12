package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please give the length of the rectangle: ");
        Integer length = input.nextInt();

        System.out.println("Please give the width of the rectangle: ");
        Integer width = input.nextInt();

        Integer area = length*width;

        System.out.println(String.format("Area of the rectangle is: %d",area));
    }
}


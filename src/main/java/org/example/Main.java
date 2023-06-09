package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                int a = 15;
        // Add 5 to a without repeating the a variable
                a += 5;
        // Subtract 4 from a without repeating the a variable
                a -= 4;
        // Assign the value of a to int b
                int b = a;
        // Increment b by one without using a or int b = b + 1
                b++;
        // Check if b is an odd number
                boolean statement1 = b % 2 != 0;
        // Check if the result of (b multiplied for b + 1) is a multiple of 3
                boolean statement2 = (b * (b + 1)) % 3 == 0;

                if (statement1 && statement2) {
                    System.out.println("Both statements are true");
                } else if (statement1 || statement2){
                    System.out.println("At least one of the statements is false");
                } else {
                    System.out.println("all off them are wrong ");
                }
    }
}
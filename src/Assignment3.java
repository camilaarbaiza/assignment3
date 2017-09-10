
/*
   @author Camila Arbaiza
   CSC 201-004N
   Professor Tanes Kanchanawanchai

   The purpose of this program is to dispay the nonzero denominations only, using singular words for single units

   */

import java.util.Scanner;

public class Assignment3 {


    /**
     *
     * @param a total amount of money
     * @param d number of dollars
     * @param q number of quarters
     * @param dim number of dimes
     * @param n number of nickels
     * @param p number of pennies
     * @return String
     */
    public static String displayCurrency(double a, int d, int q, int dim, int n, int p){

        return ("Your amount " + a + " consists of "+ d+" dollars "+q+" quarters "+dim+" dimes "+n+" nickels and "+p+" pennies");
    }

    public static void main(String [] args) {


        // Create a Scanner
         Scanner input = new Scanner(System.in);

         // Receive the amount
         System.out.print("Enter an amount in double, for example 11.56: ");
         double amount = input.nextDouble();

         int remainingAmount = (int)(amount * 100);

         // Find the number of one dollars
         int numberOfOneDollars = remainingAmount / 100;
         remainingAmount = remainingAmount % 100;

         // Find the number of quarters in the remaining amount
         int numberOfQuarters = remainingAmount / 25;

        remainingAmount = remainingAmount % 25;

         // Find the number of dimes in the remaining amount
         int numberOfDimes = remainingAmount / 10;
         remainingAmount = remainingAmount % 10;

         // Find the number of nickels in the remaining amount
         int numberOfNickels = remainingAmount / 5;
         remainingAmount = remainingAmount % 5;

         // Find the number of pennies in the remaining amount
         int numberOfPennies = remainingAmount;

         // Display results

        if(amount < 0){
            System.out.println("You entered an invalid negative amount of " + amount);
        }
        else {
            System.out.println("Your amount " + amount + " consists of");

            if (numberOfOneDollars == 0) {
                System.out.print("");
            } else if (numberOfOneDollars == 1) {
                System.out.println(" " + numberOfOneDollars + " dollar");
            } else {
                System.out.println(" " + numberOfOneDollars + " dollars");
            }
            if (numberOfQuarters == 0) {
                System.out.print("");
            } else if (numberOfQuarters == 1) {
                System.out.println(" " + numberOfQuarters + " quarter ");
            } else {
                System.out.println(" " + numberOfQuarters + " quarters ");
            }
            if (numberOfDimes == 0) {
                System.out.print("");
            } else if (numberOfDimes == 1) {
                System.out.println(" " + numberOfDimes + " dime");
            } else {
                System.out.println(" " + numberOfDimes + " dimes");
            }
            if (numberOfNickels == 0) {
                System.out.print("");
            } else if (numberOfNickels == 1) {
                System.out.println(" " + numberOfNickels + " nickel");
            } else {
                System.out.println(" " + numberOfNickels + " nickels");
            }
            if (numberOfPennies == 0) {
                System.out.print("");
            } else if (numberOfPennies == 1) {
                System.out.println(" " + numberOfPennies + " penny");
            } else {
                System.out.println(" " + numberOfPennies + " pennies");
            }

        }

    }//end main
} //end Assignment3 class

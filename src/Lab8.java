import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ericm on 7/5/2017.
 */
public class Lab8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);


        System.out.println("Welcome to Batting Average Calculator!");
        System.out.println();
        System.out.println("Please enter a number of times a player is at bat: ");
        int atBat = scnr.nextInt();
        double batAvg = 0.0;
        double sluggPercentage = 0.0;
        int[] arr = new int[atBat];//Sets the arr length to the users input of atBat. if input of atBat is 4, program will only run 4 times.


        System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");


            fillArray(scnr, arr);

            double basesTotal = getBasesTotal(arr);

            double hits = getHits(arr);

            batAvg = hits / atBat;
            sluggPercentage = basesTotal / atBat;

            System.out.println("Batting average is: " + batAvg);
            System.out.println("Slugging percentage is: " + sluggPercentage);
            System.out.println();






    }


    private static double getHits(int[] arr) {
        double hits = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1) {
            } else {
                hits += 1;
            }

        }
        return hits;
    }

    private static double getBasesTotal(int[] arr) {
        double basesTotal = 0;//for loop takes the number input from
        for (int i = 0; i < arr.length; i++) {
            basesTotal += arr[i];
        }
        return basesTotal;
    }

    private static void fillArray(Scanner scnr, int[] arr) {
        for (int i = 0; i < arr.length; i++) {//Communicates the user input for baseEarned is associated with index of i.

            System.out.println();
            System.out.println("Result for at-bat " + (i + 1) + ": ");//(i +1) makes sure the counter reads one due to i's initial index of 0.
            int baseEarned = scnr.nextInt();//Saves user input to baseEarned

            arr[i] = baseEarned;//while loops checks to make sure the input is between 4 and 0. Does not check for letters.
            while (baseEarned > 4 | baseEarned < 0) {
                System.out.println("Invalid input. Please try again: ");
                baseEarned = scnr.nextInt();
            }

        }
    }
}

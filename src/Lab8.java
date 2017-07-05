import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ericm on 7/5/2017.
 */
public class Lab8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double sluggPercent;
        double battingAvg;
        int rollCount = 1;

        System.out.println("Welcome to Batting Average Calculator!");
        System.out.println();
        System.out.println("Please enter a number of times a player is at bat: ");
        int arrSize = scnr.nextInt();

        int[] atBat = new int[arrSize];

        System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");


        for (int i = 0; i < atBat.length; i++) {

            System.out.println();
            System.out.println("Result for at-bat " + rollCount + ": ");
            int baseEarned = scnr.nextInt();
            rollCount++;

            atBat[i] = baseEarned;


        }





    }
}

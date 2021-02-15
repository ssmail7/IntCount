//************************************************************
//  Author: Steven Smail
//
//  int_count.java
//
//  This program reads an arbitrary number of integers in the
//  range 1 to 50, terminates from a 0 input, and outputs the
//  total numbers of each value.
//************************************************************

import java.util.Scanner;

public class int_count{    public static void main (String[] args)    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println();
        System.out.println("This is program int_count.");
        System.out.println();

        System.out.println("Enter integers in the range 1 to 50 to be counted.");
        System.out.println("Enter 0 to stop input and show the counts.");
        System.out.println();

        //Declare the integer array and size
        int[] count = new int[51];

        //Initialize the array values
        for (int index = 0; index < count.length; index++)        {
            count[index] = 0;
        }

        //Create an input loop with an array count
        do
        {
            System.out.print("Enter input: ");
            n = scanner.nextInt();
            if (n != 0)
            {
                if (n < 1 || n > 50)
                {
                    System.out.println(n + " is not a valid input.");
                }
                else
                {
                    count[n]++;
                }
            }
        } while (n != 0);

        System.out.println();

        //Output array values and counts
        System.out.println("Value \t Count");

        for (int index = 0; index < count.length; index++)        {
            if (count[index] != 0)
            {
            System.out.println(index + " \t " + count[index]);
            }
        }

        System.out.println();
        System.out.println("Program complete");
        System.out.println();

    }
}
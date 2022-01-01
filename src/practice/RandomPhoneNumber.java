package practice;

import java.util.Random;
import java.util.Scanner;

public class RandomPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int fSet = generator.nextInt(899)+ 100; // first 3 random digits till 999
        // + 100 to make sure the number is three digit number and not only 1 and 2 digit number
        int sSet = generator.nextInt(555) + 100; // second 3 random digits till 655
        // + 100 to make sure the number is three digit number and not only 1 and 2 digit number
        int tSet = generator.nextInt(8999) + 1000; // last 4 random digits till 9999
        // + 1000 to make sure the number is four digit number, andnot only  1,2 or 3 digit
        String first;
        first = Integer.toString(fSet); // converting first 3 digits to string


        while (first.contains("8") || first.contains("9")) // checking if the first 3 digit string contains 8 or 9
        {
            fSet = generator.nextInt(899) + 100; // getting different value of fSet
            first = Integer.toString(fSet); // converting fSet to string to check the digits
        }

        System.out.println(fSet + "-" + sSet + "-" + tSet); // printing out in phone number format

    }


}

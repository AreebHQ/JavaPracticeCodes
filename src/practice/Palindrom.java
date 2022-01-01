package practice;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter text: ");
        String word  = scnr.nextLine();
        String reverse = "";
        String temp = word;

        word = word.replaceAll(" ", "");
        for (int i = word.length() - 1; i >= 0; i--) {

            reverse = reverse + word.charAt(i);
        }

        for (int i=0, j=0; i < word.length(); i++, j++)
        {
            if (word.charAt(i) != reverse.charAt(j))
            {
                System.out.println("not a palindrome: " + temp);
                System.exit(0);
            }
        }

        System.out.println("palindrome: " + temp);

    }

}

package practice;

import java.util.Scanner;

public class twoLetterDomainNumber {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        char letter1;
        char letter2;
        char num;

        System.out.println("Two-letter domain names:");

        letter1 = 'a';

        while (letter1 <= 'z') {

            letter2 = 'a';

            while (letter2 <= 'z') {

                System.out.println("" + letter1 + "" + letter2 + ".com");

                ++letter2;

            }

            num = '0';

            while (num <= '9' && num >= '0') {

                System.out.println("" + letter1 + "" + num + ".com");

                ++num;

            }

            ++letter1;

        }

        return;

    }


}

package practice;

import java.util.Random;
import java.util.Scanner;

public class ReaptingCountUnderLimit {
    public static void main(String[] args) {
        Random rnd = new Random(); //java random object
        Scanner scrn = new Scanner(System.in);
        int Count = 0;
        int num;
        int limit;
        System.out.println("Enter the limit: ");
        limit = scrn.nextInt();
        System.out.println("Enter the num: ");
        num = scrn.nextInt();
        for (int i = num; i <= limit; i+=num)
        {

            System.out.println(i);
        }

    }
}

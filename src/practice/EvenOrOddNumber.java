package practice;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
       EvenOrOddNumber obj = new EvenOrOddNumber();
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter a positive number");
        num = input.nextInt();

        System.out.println( obj.isEven(num));
    }

    boolean isEven (int x)
    {
        return (x%2==0);

    }

}

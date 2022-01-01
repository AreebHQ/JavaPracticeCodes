package practice;

import java.util.Scanner;

public class LargestPrimeNumber {
    public static void main(String[] args) {

        LargestPrimeNumber obj = new LargestPrimeNumber();
        Scanner input = new Scanner(System.in);
        int limit;
        int largest = 0;
        System.out.println("Enter a positive number: ");
        limit = input.nextInt();

        for(int i=limit-1; i>1; i--)
        {
            if (obj.isPrime(i)){
                largest = i;
                break;
            }
        }

        System.out.println( largest);


    }

    boolean isPrime(int x)
    {
        for (int i =2; i <x; i++)

            if (x%i==0)
                return false;
        return true;
    }

}

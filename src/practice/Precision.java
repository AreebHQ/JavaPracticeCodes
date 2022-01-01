package practice;

public class Precision {
    public static void main(String[] args) {
        double pos = 0, neg = 0, zero = 0;
        int arr[] = {0,3,-8,2,1,5,6,3,-5,5,8};
        for(int i=0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                pos++;
            } else if (arr[i] < 0)
            {
                neg++;
            } else if (arr[i] ==0)
            {
                zero++;
            }

        }
        System.out.println( String.format("%.6f", (pos/arr.length)));
        System.out.println( String.format("%.6f", (neg/arr.length)));
        System.out.println( String.format("%.6f", (zero/arr.length)));
    }
}

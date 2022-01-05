package practice;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        practice obj = new practice();
      int A[] = {1,2,5,7,9,4,6};

        obj.MergeSort(A,0,A.length-1);

        for(int a : A)
        {
            System.out.println(a);
        }

    }


    void Merge(int A[], int l, int mid, int h)
    {
        int i=l, k=l, j=mid+1;
        // i=0, k =0

        int B[]= new int[100];

        while(i<=mid && j<=h)
        {
            if(A[i]<A[j]){
                B[k++]=A[i++];
            }
            else
                B[k++]=A[j++];
        }
        //as i=0 upto mid
        for(;i<=mid;i++)
            B[k++]=A[i];
        // as j=mid upto high h
        for(;j<=h;j++)
            B[k++]=A[j];

        for(i=l;i<=h;i++)
            A[i]=B[i];

    }

    void MergeSort(int A[], int l, int h)
    {
        if(l<h)
        {
            int mid = (l+h)/2;
            MergeSort(A,l,mid);
            MergeSort(A,mid+1,h);
            Merge(A,l,mid,h);
        }


    }

/*  void checking()
    {
        for(int i=0; i<str.length; i++)
        {
            String n = "";
            for(int j=0; j <str[i].length();j++)
            {

                //  System.out.println(str[i].charAt(j));
                if(checking.containsKey(String.valueOf(str[i].charAt(j))))
                {
                    if(checking.get(String.valueOf(str[i].charAt(j)))!= 0)
                    {
                        n = n+String.valueOf(str[i].charAt(j));
                        checking.put(String.valueOf(str[i].charAt(j)), checking.get(String.valueOf(str[i].charAt(j)))-1);
                        //System.out.println(n);

                        if(n.equals(str[i]))
                        {
                            nums = nums+String.valueOf(i+1);
                            // System.out.println(n);
                            //System.out.println(nums);
                            numList.add(n);

                        }

                    }

                } else {

                    break;
                }
            }
        }

    }*/

}







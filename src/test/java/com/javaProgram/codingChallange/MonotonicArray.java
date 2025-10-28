package com.javaProgram.codingChallange;

public class MonotonicArray {
    /*
    Monotonic array is array which is either in increasing or decreasing order
     */
    public static void main(String args[])
    {
        int array[]=new int[]{1,2,3,4,5};
        boolean increasing=true,decreasing=true;
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]<array[i+1])
            {
                decreasing=false;
            }
            else if(array[i]>array[i+1])
            {
                increasing=false;
            }
        }

        if(increasing || decreasing)
        {
            System.out.println("Array is monotonic");
        }
        else
        {
            System.out.println("Array is not monotonic");
        }

    }
}

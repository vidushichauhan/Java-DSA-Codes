import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void reverse(int arr[], int n)
    {   
        int storeElement;
        int secondIndex;
    	for(int i=0 ; i< arr.length/2; i++){
            storeElement = arr[i];
            secondIndex = arr.length - i-1;
            arr[i] = arr[secondIndex];
            arr[secondIndex] = storeElement;
           }
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 5, 7, 30, 40}, n = 5;

       System.out.println("Before Reverse");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       reverse(arr, n);

       System.out.println("After Reverse");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}

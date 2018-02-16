import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotate {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int i=0,j=1;
         int temp;
        for(j=1;j<=k;j++)
        {
            temp=a[0];
            for(i=0;i<n-1;i++) {
                a[i] = a[i + 1];

            }
                a[n-1]=temp;

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5; //in.nextInt();
        int k = 4;//in.nextInt();
       // int a[] = new int[n];
        int a[] ={1,2,3,4,5};
     //   for(int a_i=0; a_i < n; a_i++){
       //     a[a_i] = in.nextInt();
        //}

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}

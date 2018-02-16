import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumPlatform {

        public static void callPlatform(int[] a,int[] d){

            Arrays.sort(a);
            Arrays.sort(d);

            int i=1,j=0;
            int n=a.length;
            int noofplatform=1,minNoOfPlatform=1;
            for(int k=0;k<n;k++)
                System.out.print(a[k] + " ");
            System.out.println();
            for(int l=0;l<n;l++)
                System.out.print(d[l] + " ");
            while(i<n && j<n)
            {
                if(a[i]<d[j])
                {
                    noofplatform++;
                    i++;
                    if(noofplatform>minNoOfPlatform)
                        minNoOfPlatform=noofplatform;
                }else{
                    if(noofplatform>0) {
                        noofplatform--;
                        j++;
                    }else{
                        noofplatform++;
                        j++;
                    }

                }

            }
            System.out.println(minNoOfPlatform);
        }
        public static void main (String[] args)
        {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i=0;i<n;i++)
            {
                int m = in.nextInt();
                int a[] = new int[m];
                int d[] = new int[m];
                for(int j=0;j<m;j++){
                    a[j] = in.nextInt();
                }for(int k=0;k<m;k++){
                d[k] = in.nextInt();
            }
                callPlatform(a,d);
            }
        }

}

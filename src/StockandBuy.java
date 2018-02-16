import java.util.*;
import java.lang.*;
import java.io.*;
    class StockandBuy
    {
        public static void stockandbuy(int[] a){

            int n = a.length;
            int start =0,end =1;
            int max =0;
            while(end<n)
            {
                if(a[end]-a[start]>max)
                {
                    max = a[end]-a[start];
                    end++;
                }
                else if(a[end]-a[start]<max){

                    System.out.print("(" + start + " ");
                    System.out.print(end-1 + ")");
                    System.out.print(" ");
                    start=end;
                    end = end+1;
                    max=0;
                }
                else
                {
                    System.out.println("No Profit");
                }
            }
            if(end==n)
            {
                System.out.print("(" + start + " ");
                System.out.print(end-1 + ")");
                System.out.println();
            }
            }

        public static void main (String[] args)
        {

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i=0;i<n;i++)
            {
                int m = in.nextInt();
                int a[] = new int[m];
                for(int j=0;j<m;j++){
                    a[j] = in.nextInt();
                }

                stockandbuy(a);

            }
        }

    }


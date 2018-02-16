import java.util.*;
import java.lang.*;
import java.io.*;
class RainWater
{

    public static void rainWater(int a[])
    {
        int capacity=0,r=a.length;
        int leftBar[]= new int[a.length];
        int rightBar[]= new int[a.length];
        leftBar[0]=a[0];
        for(int l=1;l<leftBar.length;l++)
        {
            leftBar[l]=Math.max(leftBar[l-1],a[l]);
        }
        rightBar[r-1]=a[a.length-1];
        for(int k=r-2;k>=0;k--)
        {
            rightBar[k]=Math.max(rightBar[k+1],a[k]);
        }

        for(int i=0;i<a.length;i++)
        {
            capacity += Math.min(leftBar[i],rightBar[i])-a[i];
        }
        System.out.println(capacity);
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
            rainWater(a);
        }
    }

}
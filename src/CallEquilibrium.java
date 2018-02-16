
import java.util.*;
import java.lang.*;
import java.io.*;

public class CallEquilibrium {

        public static int callEquilibirium(int a[]){
            int i,j,mid=1,aftersum=0;
            int beforesum=a[0];
            int high=a.length-1;
            if(a.length==1)
                return 1;
            if(a.length==2)
                return -1;

            for(i=1;i<a.length;i++)
            {
                aftersum+=a[i];
            }

            while(mid<=high){

                aftersum=aftersum-a[mid];
                if(beforesum==aftersum)
                    return mid+1;
                else{
                    beforesum=beforesum+a[mid];
                    //aftersum=aftersum - a[mid];

                    mid++;
                }
            }
            return -1;
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
                System.out.println(callEquilibirium(a));
            }
        }
    }


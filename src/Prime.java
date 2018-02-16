
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Prime {

    public static void primeOrNot(int n)
    {
        for(int j=2;j<=n/2;j++){
            if(n%j==0){
                System.out.println("Not Prime" + n);
                return;
            }
        }
        System.out.println("Prime"+n);
        }


        public static void main(String[] args) {
        /* Enter your code here. */
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();

            for(int i=0;i<t;i++)
            {
                int n= in.nextInt();
                primeOrNot(n);

            }
        }
    }

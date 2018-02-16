import java.util.Arrays;
import java.util.Scanner;

public class HighestThreeProduct {

    static void maxproduct(int a[]) {
        int maxprod=0;
        Arrays.sort(a);
        if(a[0]<0 && a[1]<0 && (a[0]*a[1]*a[a.length-1]>a[a.length-1]*a[a.length-2]*a[a.length-3])){
            maxprod = a[0]*a[1]*a[a.length-1];
        }
        else
            maxprod = a[a.length-1]*a[a.length-2]*a[a.length-3];

        System.out.println("Max Product "+maxprod);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= in.nextInt();

        }
        maxproduct(a);
    }
}

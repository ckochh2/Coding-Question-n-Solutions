import java.util.Scanner;

public class StockPrice {


    static void stockPrice(int a[]) {
        int n=a.length;
        int maxprofit=a[1]-a[0];
        int minelement=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]-minelement>maxprofit)
                maxprofit=a[i]-minelement;
            if(a[i]<minelement)
                minelement=a[i];
        }
        System.out.println("profit" + maxprofit);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= in.nextInt();

        }
        stockPrice(a);
    }
}


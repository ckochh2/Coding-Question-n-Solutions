import java.util.*;

public class Pairs {

    static void calculate_pair(int a[])
    {
        int n = a.length;
        int i=0,j=0,k=0;
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(a);
        int res;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((a[i]+a[j])==0)
                {
                    //res[k]= a[j];
                     // k++;
                    list.add(a[j]);
                }

            }
        }
        Collections.sort(list);
        if(list.isEmpty())
            System.out.print("0");

        for (i = 0; i < list.size(); i++) {
             res = list.get(i);
            System.out.print("-"+res + " " + res +" ");
        }

        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no_of_testcases = in.nextInt();
        int i=0,j=0;
        for(i=0;i<no_of_testcases;i++)
        {
            int arraysize=in.nextInt();
            int [] a = new int[arraysize];
            for(j=0;j<arraysize;j++) {
                a[j] = in.nextInt();
            }
            calculate_pair(a);
            System.out.println();
        }
        }


}

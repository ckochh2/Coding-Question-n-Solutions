public class Demo2 {

    public static void main(String[] args) {

        int a[] = {3,5,9,10,17,25,30};
     /*   int u;
        int start = 0, l = 2, i = 0, j = 0;
        int end = start + l;

        for(i=0;i< a.length;i++) {

            if ( (a[] <= (a[start] + l)) ) {
                    int pos = end - start / 2;
                    System.out.println(pos);
                    start = end + 1;
                    end = start + l;
                }
                else continue;
            }

            i = i + end;

        }


       */
       int low=0,high=0, l=4;

       for(int i=0;i<a.length;i++)
       {
           if (a[i]<=high)
               continue;
           else
                low=a[i];
                high=a[i]+l;
                if(i+1 != a.length) {
                    int u = (low + high) / 2;
                    System.out.println(u);
                }else
                    {
                    int u=a[i];
                    System.out.println(u);
                }
       }
    }
}

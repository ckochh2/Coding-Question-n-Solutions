public class Main {

    public static void main(String[] args) {
        //   System.out.println("Hello World!");

        int a[] = {1, 1, 3, 5, 6, 6,20};
        int b[] = {1, 1, 6, 6, 9, 16,20};
        int i = 0, j = 0, k = 0;
        int c[] = new int[a.length];
        //   System.out.print(a.length);
        while (i < a.length && j < b.length) {
            // System.out.println(a.length);
            if (a[i] < b[j])
                i++;
            else if (a[i] > b[j])
                j++;
            else if (k == 0) {
                c[k] = a[i];
                System.out.println(c[k]);
                i++;
                k++;
                j++;
            } else if (k != 0 && c[k - 1] != a[i]) {
                System.out.println("Entering else");
                c[k] = a[i];
                System.out.println(c[k]);
                i++;
                k++;
                j++;

            } else {
                i++;
                j++;
            }

        }
    }
}

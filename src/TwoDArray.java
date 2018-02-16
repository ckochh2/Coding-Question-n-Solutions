import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        int maxsum=0;
        int sum =0;
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int m=0; m < 4; m++) {
            for (int n = 0; n < 4; n++) {

                sum = arr[m][n] + arr[m][n + 1] + arr[m][n + 2]
                        + arr[m + 1][n + 1]
                        + arr[m + 2][n] + arr[m + 2][n + 1] + arr[m + 2][n + 2];

                if ( sum >= maxsum )
                    maxsum = sum;
            }
        }

    System.out.println("maxsum "+maxsum);
    }
}

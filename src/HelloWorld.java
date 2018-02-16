import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.H;

public class HelloWorld {
	public static void main(String[] args) {

		/*
	   // int a=5;
	  //  int median = (int)Math.ceil((double)a/2);
	//    System.out.println(median);
	 //   int a[] = {10, 5, 3, 4, 3, 5, 6};
	   // HashMap<Integer,Integer> h= new HashMap<>();
		//for (int i=0;i<a.length;i++)
		{
		//    if(!h.containsKey(a[i]))
			{

			}
		}


		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[m];
        int d[] = new int[m];
		for(int i=0;i<n;i++)
		{


			for(int j=0;j<m;j++){
				a[j] = in.nextInt();
			}for(int k=0;k<m;k++){
			d[k] = in.nextInt();
		}

		}
        Arrays.sort(a);
        Arrays.sort(d);
        for(int k=0;k<a.length;k++)
            System.out.print(a[k] + " ");
        System.out.println();
        for(int l=0;l<d.length;l++)
            System.out.print(d[l] + " ");
*/

		String Str = new String("Welcome.to.Tu,torialspoint.com");
		System.out.println("Return Value :" );

		for (String retval: Str.split("\\.")) {
			System.out.println(retval);
		}
	}
	}

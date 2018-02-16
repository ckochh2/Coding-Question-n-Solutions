import java.util.Scanner;

public class MaxTip {

    static void calculate_MaxTip(int totalOrders,int totalOrderOfWaiter1,int totalOrderOfWaiter2,int[] tipForWaiter1,int[] tipForWaiter2){

        int maxTip=0;
        for(int i=0;i<totalOrders;i++)
        {
            if(tipForWaiter1[i]>tipForWaiter2[i] && totalOrderOfWaiter1>0)
            {
                maxTip=maxTip+tipForWaiter1[i];
                totalOrderOfWaiter1--;
            }
            else if(tipForWaiter2[i]>tipForWaiter1[i] && totalOrderOfWaiter2>0)
            {
                maxTip=maxTip+tipForWaiter2[i];
                totalOrderOfWaiter2--;
            }
         /*   else if(totalOrderOfWaiter1>0)
            {
                maxTip=maxTip+tipForWaiter1[i];
                totalOrderOfWaiter1--;
            } */
            else if(tipForWaiter1[i]==tipForWaiter2[i])
            {
                maxTip=maxTip+tipForWaiter2[i];

            }
        }
        System.out.println(maxTip);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no_of_testcases = in.nextInt();
        int i=0,j=0,k=0;
        for(i=0;i<no_of_testcases;i++)
        {

            int totalOrders=in.nextInt();
            int totalOrderOfWaiter1 = in.nextInt();
            int totalOrderOfWaiter2 = in.nextInt();
            int [] tipForWaiter1 = new int[totalOrders];
            int [] tipForWaiter2 = new int[totalOrders];
            for(j=0;j<totalOrders;j++) {
                tipForWaiter1[j] = in.nextInt();
            }
            if(in.hasNextLine()){
            for(k=0;k<totalOrders;k++) {
                tipForWaiter2[k] = in.nextInt();
            }}
            calculate_MaxTip(totalOrders,totalOrderOfWaiter1,totalOrderOfWaiter2,tipForWaiter1,tipForWaiter2);
            System.out.println();
        }
    }
}

public class Solutions {

        public int[] twoSum(int[] nums, int target) {
            int[]res= new int[2];
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if((nums[i]+nums[j])==target)
                    {
                        res[0]=i;
                        res[1]=j;


                    }
                    else continue;
                }
            }
            return res;
                  }

    public static void main(String[] args) {
        Solutions s = new Solutions();
        int a[]={2,3,3};
        int b[] = s.twoSum(a,6);
        for(int k=0;k<b.length;k++)
        System.out.println(b[k]);
    }
}

import java.util.Scanner;

public class MedianTwoSortedArray {

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int i=0,j=0,k=0;
            int result[]=new int[nums1.length+nums2.length];
            while(i<nums1.length && j<nums2.length)
            {
                if(nums1[i]<=nums2[j])
                {
                    result[k]=nums1[i];
                    i++;
                    k++;
                }else{
                    result[k]=nums2[j];
                    j++;
                    k++;
                }
                if(j==nums2.length && i<nums1.length)
                {
                    result[k]=nums1[i];
                    i++;
                    k++;
                }
                if(i==nums1.length && j<nums2.length)
                {
                    result[k]=nums2[j];
                    j++;
                    k++;
                }
            }
            int total = nums1.length+nums2.length;

            if(total%2!=0)
            {
                int median = (int)Math.ceil((double)total/2);
                System.out.println("median " + result[median-1]);
                return result[median-1];
            }else{
                return (result[total/2-1]+result[total/2])/2;
            }

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            int nums1[] = new int[n];
            int nums2[] = new int[m];
             for(int i=0;i<m;i++)
            {

                nums2[i] = in.nextInt();
            }

            System.out.println("The median is "+ findMedianSortedArrays(nums1, nums2));
        }
    }

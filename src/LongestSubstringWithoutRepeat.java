import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithoutRepeat {

       static int lengthOfLongestSubstring(String s) {
           int count =0,max=0;
           int i=0,j=0;
           char [] c = s.toCharArray();
           Map<Character,Integer> map = new HashMap<>();
           for(i=0;i<c.length;i++)
           {
               if(map.containsKey(c[j]))
               {
                   if(max<=count)
                       max=count;


                   map.clear();
                   map.put(c[i],i);
                   count=1;

               }

               else
               {
                   map.put(c[j],j);
                   j++;
                   max=Math.max(max,j-i);

               }
           }
           return max;

       }


            public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
               String s = in.next();
                int res = lengthOfLongestSubstring(s);
                System.out.println(res);
            }

    }

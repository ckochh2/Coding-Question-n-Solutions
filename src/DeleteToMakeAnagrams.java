import java.util.Scanner;

public class DeleteToMakeAnagrams {

    public static int numberNeeded(String first, String second) {
        int i=0,count=0;
        int freqF[] = new int[26];
        int freqS[] = new int[26];
        for(i=0;i<first.length();i++)
        {
            freqF[first.charAt(i) - 'a']++;
        }
        for(int j=0;j<second.length();j++)
        {
            freqS[second.charAt(j)-'a']++;
        }
        for(int k=0;k<26;k++)
        {
            count=count+ Math.abs(freqF[k]-freqS[k]);
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

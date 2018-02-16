import java.util.*;

    public class HashRansomNote {
        Map<String, Integer> magazineMap;
        Map<String, Integer> noteMap;

        public HashRansomNote(String magazine, String note) {
      //    for(String s:magazine)
        //      magazineMap.put(s);

        }



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            // Eat whitespace to beginning of next line
            scanner.nextLine();

            HashRansomNote s = new HashRansomNote(scanner.nextLine(), scanner.nextLine());
            scanner.close();

          //  boolean answer = s.solve();
           // if(answer)
                System.out.println("Yes");
         //   else System.out.println("No");

        }
    }

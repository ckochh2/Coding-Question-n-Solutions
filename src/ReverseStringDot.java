import java.util.*;
        import java.lang.*;
        import java.io.*;
class ReverseStringDot {
    public static void reverseString(String s) {
      //  StringBuilder sb = new StringBuilder();

        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> reverse = new ArrayList<String>();

        for(String i:s.split("\\.")) {
          // System.out.print(i);
            al.add(i);
        }

        /*
        ListIterator<String> itr = al.listIterator();
        ListIterator<String> itr1 = reverse.listIterator();

        while(itr.hasNext()){
                    }
        while (itr.hasPrevious()) {
            reverse.add(itr.previous());
        //    System.out.print(itr.previous());
        }

        while (itr1.hasNext()) {
          //  System.out.print(itr1.next());
        }*/
        Collections.reverse(al);
        String join = String.join(".", al);
        System.out.println(join);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            reverseString(s);
        }
    }
}
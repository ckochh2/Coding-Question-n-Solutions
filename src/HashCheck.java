// Java p
// rogram to find union and intersection
// using Hashing

import java.util.HashSet;

class HashCheck
{
    static int arr1[] = new int[]{7, 1, 1, 2, 3, 6};
    static int arr2[] = new int[]{3, 1, 1, 20, 7};

    // Prints union of arr1[0..m-1] and arr2[0..n-1]
    static void printUnion()
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
                  }
    //    System.out.println(hs);
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        System.out.println(hs);

    }

    // Prints intersection of arr1[0..m-1] and arr2[0..n-1]
    static void printIntersection()
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();


        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        System.out.println(hs);
        for (int i = 0; i < arr2.length; i++) {
            if(hs.contains(arr2[i])){
                hs1.add(arr2[i]);
            }

        }

        System.out.println(hs1);
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {

        System.out.println("Union of two arrays is : ");
        printUnion();

        System.out.println("Intersection of two arrays is : ");
        printIntersection();

    }
}
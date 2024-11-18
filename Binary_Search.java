
//Binary search is an efficient algorithm to find an element in a sorted list by repeatedly dividing the search range in half.
//        Time:𝑂(log𝑛) halves the search space with each step.

//        Disadvantages:
//        Requires sorted data.
//        Less efficient for small datasets.
//        Needs random access, so it’s not ideal for linked lists.

//        Use Cases:
//        Searching large, sorted datasets (e.g., finding a name in a sorted list).
//        Efficiently finding the first/last occurrence of elements.
//        Optimizations in algorithms that require fast lookups.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Binary_Search {
    public static void main (String arg[]){
        int array[]=new int[100];
        int target = 46;
        for (int i =0; i<100;i++){
            array[i]= i;
        }
        ArrayList<String> arrays = new ArrayList<String>();
        int index = Arrays.binarySearch(array,8);
        System.out.println(index);
        arrays.add("a");
        arrays.add("c");
        arrays.add("e");
        arrays.add("d");
        arrays.add("f");

        int index2 = Collections.binarySearch(arrays,"e");
        System.out.println(index2);

        int index3 = BinarySearch(array, target);
        System.out.println(index3);

    }

    private static int BinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length -1 ;

        while (low <= high){
            int middle = low +(high- low)/2;
            int value = array[middle];
            if(value < target) low = middle+1;
            else if (value >target) high = middle-1;
            else return middle;
        }
        return -1;
    }
}

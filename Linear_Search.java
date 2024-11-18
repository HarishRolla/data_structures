// linear search = iterate through a collection one element at a time
// run time complexity: o(n)
// disadvantages: slow for large data sets
// advantages :
// fast for small and medium data sets
// does not need to sorted
// usefull for data structures that do not have random access to elements(linked list)


public class Linear_Search {
    public static void main (String arg[]){

        int[] array= {9,6,2,7,1,3,5};
        int index = LinearSearch(array,4);
        System.out.println(index);

    }

    private static int LinearSearch(int[] array, int value) {

        for (int i = 0; i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }

}

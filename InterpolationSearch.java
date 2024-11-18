

// interpolation search = improvement over binary search best used for " Uniformly " distributed
// it works on sorted array  \
// "guesses" where a value might be based on caluclated probe results
// if probe is incorrect , search area is narrowed, and a new probe is caluclated

// average case : O(log(log(n)))
//worst case: O(n) values increase exponentially


public class InterpolationSearch {
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = interpolation_Search(array, 8);



    }

    private static int interpolation_Search(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while(value >=array[low] && value <=  array[high] && low <= high ){
            int probe = low + (high - low)* (value - array[low])/
                        (array[high]- array[low]);
            System.out.println("probe: " +probe);
            if (array[probe] == value ) return probe;
            else if (array[probe]< value) low = probe +1;
        }

        return 0;
    }
}

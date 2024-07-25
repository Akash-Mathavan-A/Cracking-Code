import java.util.HashMap;

public class ArraysEqual {
    /*
     * Given two arrays arr1 and arr2 of equal size, 
     * the task is to find whether the given arrays are equal.
     *                          or
     * Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m, 
     * where both arrays may contain duplicate elements. 
     * The task is to determine whether array a2 is a subset of array a1.
     *  It's important to note that both arrays can be sorted or unsorted.
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 4, 0, 1};
        System.out.println(Array(arr1 , arr2));
    }

    public static boolean Array(int[] nums1 , int[] nums2){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int key : nums1){
            map.put(key , map.getOrDefault(key, 0) + 1);
        }

        for(int key : nums2){
            if(!map.containsKey(key) || map.get(key) == 0){
                return false;
            }
            map.put(key , map.get(key) - 1);
        }

        return true;
    }
}

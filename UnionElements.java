import java.util.HashSet;

public class UnionElements {

    /*
     * Given two arrays arr1[] and arr2[], 
     * the task is to find the number of elements in the union between these two arrays.
     * The Union of the two arrays can be defined as the set containing distinct elements from both arrays. 
     * If there are repetitions, then only one element occurrence should be there in the union.
     * Note: Elements are not necessarily distinct.
     */

     public static void main(String[] args){
        int[] nums1 = {85, 25, 1, 32, 54, 6};
        int[] nums2 = {85 , 3};
        System.out.println(ElementsCount(nums1, nums2));
    }

    public static int ElementsCount(int[] nums1 , int[] nums2){
        HashSet<Integer> unionSet = new HashSet<>();

        for(int key : nums1){
            unionSet.add(key);
        }

        for(int key : nums2){
            unionSet.add(key);
        }

        return unionSet.size();
    }
}

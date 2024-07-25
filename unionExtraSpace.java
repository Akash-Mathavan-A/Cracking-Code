import java.util.Arrays;
import java.util.HashSet;

public class unionExtraSpace {
    
    /*
     * Union of Sorted and unsorted array Elements using Hash or Extra space
    */
    
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,2,2,2};
        int[] resultArray = unionArray(nums1 , nums2);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] unionArray(int[] nums1 , int[] nums2){
        HashSet<Integer> unionSet = new HashSet<>();

        for(int key : nums1){
            unionSet.add(key);
        }

        for(int key : nums2){
            unionSet.add(key);
        }

        int[] result = new int[unionSet.size()];
        int k = 0;
        for(int value : unionSet){
            result[k++] = value; 
        }
        return result;
    }
}

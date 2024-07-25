import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionSortDistinct {

    /*
     * Given two sorted arrays nums1 and nums2, return an array of their intersection.
     *  Each element in the result may must unique.
     */
    
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3,4,5,6,6,7};
        int[] nums2 = {1,2,2,3,4,6,6,8,9};
        int[] inter = DistinctArray(nums1, nums2);
        System.out.println(Arrays.toString(inter));
    }

    public static int[] DistinctArray(int[] nums1 , int[] nums2){
         ArrayList<Integer> list = new ArrayList<>();
        int i = 0 , j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int[] result = new int[list.size()];
        int k = 0;
        for(int value : list){
            result[k++] = value;
        }
        return result;
    }
}

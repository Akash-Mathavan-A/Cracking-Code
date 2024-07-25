import java.util.*;

public class Union{
    /*
     * Given two arrays arr1[] and arr2[], 
     * the task is to  union of the elements in the two arrays.
     */
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,2,2,2};
        int[] resultArray = UnionArray(nums1 , nums2);
        System.out.println(Arrays.toString(resultArray));
    }

    public static int[] UnionArray(int[] nums1 , int []nums2){
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0 , j = 0;
        int n = nums1.length , m = nums2.length;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                checkArray(union, nums1[i]);
                i++;
            }else if(nums1[i] > nums2[j]){
                checkArray(union , nums2[j]);
                j++;
            }else{
                checkArray(union, nums1[i]);
                i++;
                j++;
            }
        }

        while(i < n){
            if(nums1[i] < nums2[j]){
                checkArray(union, nums1[i]);
                i++;
            }
        }

        while(j < m){
            if(nums1[i] > nums2[j]){
                checkArray(union , nums2[j]);
                j++;
            }
        }

        int[] result = new int[union.size()];
        int k = 0;
        for(int value : union){
            result[k++] = value; 
        }
        return result;
    }

    public static void checkArray(ArrayList<Integer> union , int value){
        if(union.isEmpty() || union.get(union.size() - 1) != value){
            union.add(value);
        }
    }
}
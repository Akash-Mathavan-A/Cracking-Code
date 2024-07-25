import java.util.*;
public class Sort012{
    public static void main(String[] args){
        int[] nums = {2,2,2,1,1,0,0,2,2,1,0,0,1};
        Sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    
    public static void Sort(int[] nums){
        int low = 0 , mid = 0 , high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                Swap(nums , mid , low);
                mid += 1;
                low += 1;
            }else if(nums[mid] == 1){
                mid += 1;
            }else{
                Swap(nums, mid, high);
                high -= 1;
            }
        }
    }

    public static void Swap(int[] nums , int l , int e){
        int temp = nums[l];
        nums[l] = nums[e];
        nums[e] = temp;
    }
}
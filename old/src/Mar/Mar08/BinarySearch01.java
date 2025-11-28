package Mar.Mar08;

/**
 * @author Hs
 * @Date 2022/3/8 10:31
 */
public class BinarySearch01 {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{5,6}, 5));
        System.out.println(binarySearch(new int[]{1,5,6}, 5));
        System.out.println(binarySearch(new int[]{5}, 5));
        System.out.println(binarySearch(new int[]{1,2,4,5,6}, 5));
        System.out.println(binarySearch(new int[]{1,2,4,5}, 5));
    }
    public static int binarySearch(int[] nums,int target){
        //int left=0;
        //int right=nums.length;
        //while (left<right){
        //    int mid=left+(right-left)/2;
        //    if (nums[mid]==target){
        //        return mid;
        //    }else if (target<nums[mid]){
        //        right=mid;
        //    }else {
        //        left=mid+1;
        //    }
        //}
        //return -1;

        int left = 0;
        int right = nums.length - 1; // 注意

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1; // 注意
            else if (nums[mid] > target)
                right = mid - 1; // 注意
        }
        return -1;
    }
}

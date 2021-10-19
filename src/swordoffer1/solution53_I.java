package swordoffer1;

public class solution53_I {
    public int search(int[] nums, int target) {//二分的边界是 left<=right mid=left+(right-left)/2
        int count=0;
        int len=nums.length;
        int left=0;
        int right=len-1;
        int mid=left+(right)/2;
        int index=-1;
        while(left<=right){
            if(nums[mid]==target) {
                index=mid;
                break;
            }else if(nums[mid]>target){
                right=mid-1;
                mid=left+(right-left)/2;
            }else {
                left=mid+1;
                mid=left+(right-left)/2;
            }
        }
        if(index==-1){
            return 0;
        }else{
            count=1;
            for(int i=index-1;i>=0;i--){
                if(nums[i]==target){
                    count++;
                }else break;
            }
            for(int i=index+1;i<len;i++){
                if(nums[i]==target){
                    count++;
                }else break;
            }
            return count;
        }
    }

//    public int search(int[] nums, int target) {  // 较慢
//        int left=0;
//        int right=nums.length-1;
//        int count;
//        int index=-1;
//        int mid=left+(right-left)/2;
//        index=margeSearch(nums,left,right,target);
//        if(index==-1){
//            return 0;
//        }else {
//            count=1;
//            for (int i = index-1; i >=0 ; i--) {
//                if(nums[i]==target){
//                    count++;
//                }
//            }
//            for (int i = index+1; i < nums.length; i++) {
//                if(nums[i]==target){
//                    count++;
//                }
//            }
//            return count;
//        }
//    }
//
//    private int margeSearch(int[] nums, int left, int right, int target) {
//        if(left>right) return -1;
//        int index=-1;
//        int mid=left+(right-left)/2;
//        if(nums[mid]==target) {
//            return mid;
//        }else if(nums[mid]<target){
//            return margeSearch(nums,mid+1,right,target);
//        }else {
//            return margeSearch(nums,left,mid-1,target);
//        }
//    }
}

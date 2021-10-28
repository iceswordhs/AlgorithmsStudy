package swordoffer1;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Hs
 * @Date 2021/10/26 21:40
 */

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 *  思路1：直接sort排序 取前k个
 *
 *  思路2：使用快排思想
 *
 *  思路3：桶排序思想
 *  由于arr中的值都<10000，创建一个temp[10001]数组，
 *  遍历arr，对每个值都在temp[arr[i]]中加1，这样就能知道每个值出现的次数了。
 *  然后遍历temp，每当temp[i]!=0时，就是出现了一个较小值(因为i是从小到大的)
 *  遍历temp[i]次，将i放入结果数组中
 */
public class solution40 {
    //public int[] getLeastNumbers(int[] arr, int k) {
        /**
         * 使用sort排序，取前六个
         */
        //Arrays.sort(arr);
        //int[] result=new int[k];
        //for(int i=0;i<k;i++){
        //    result[i]=arr[i];
        //}
        //return result;

        /**
         * 快速排序思想
         */
    //    randomizedSelected(arr, 0, arr.length - 1, k);
    //    int[] vec = new int[k];
    //    for (int i = 0; i < k; ++i) {
    //        vec[i] = arr[i];
    //    }
    //    return vec;
    //
    //
    //}
    //private void randomizedSelected(int[] arr, int l, int r, int k) {
    //    if (l >= r) {
    //        return;
    //    }
    //    int pos = randomizedPartition(arr, l, r);
    //    int num = pos - l + 1;
    //    if (k == num) {
    //        return;
    //    } else if (k < num) {
    //        randomizedSelected(arr, l, pos - 1, k);
    //    } else {
    //        randomizedSelected(arr, pos + 1, r, k - num);
    //    }
    //}
    //
    //// 基于随机的划分
    //private int randomizedPartition(int[] nums, int l, int r) {
    //    int i = new Random().nextInt(r - l + 1) + l;
    //    swap(nums, r, i);
    //    return partition(nums, l, r);
    //}
    //
    //private int partition(int[] nums, int l, int r) {
    //    int pivot = nums[r];
    //    int i = l - 1;
    //    for (int j = l; j <= r - 1; ++j) {
    //        if (nums[j] <= pivot) {
    //            i = i + 1;
    //            swap(nums, i, j);
    //        }
    //    }
    //    swap(nums, i + 1, r);
    //    return i + 1;
    //}
    //
    //private void swap(int[] nums, int i, int j) {
    //    int temp = nums[i];
    //    nums[i] = nums[j];
    //    nums[j] = temp;
    //}

        /**
         * 用数组存储每个值出现的次数，从前往后遍历，数组中数不为0，就代表这个数出现过，
         * 由于是从前往后遍历，所以出现的一定是较小的值。遍历n次(即这个值出现的次数)
         */
        public int[] getLeastNumbers(int[] arr, int k) {
            if(k==0) return new int[0];
            int[] temp=new int[10001];// 记录arr中每个值出现的次数
            int[] result=new int[k];
            int index=0;
            for(int num:arr){
                temp[num]+=1;
            }
            for(int i=0;i<10001;i++){
                if(temp[i]!=0){// 当temp[i]!=时就表示这个数出现过，由于是从前往后遍历，所以这个数就是较小的
                    for(int j=0;j<temp[i];j++){// 因为一个数出现了temp[i]次，所以遍历temp[i]次
                        result[index++]=i;
                        if(index==k) return result;
                    }
                }
            }
            return result;
        }

}

package tensort;

import java.util.ArrayList;
import java.util.List;
/*
    桶排序
    时间复杂度：O(n+k)
    空间复杂度：O(n+k)
    稳定性：稳定
 */
public class BucketSort {
    private int indexFor(int a, int min, int step) {
        return (a - min) / step;
    }

    public void bucketSort(int[] arr) {

        int max = arr[0], min = arr[0];
        for (int a : arr) {
            if (max < a)
                max = a;
            if (min > a)
                min = a;
        }
        // 该值也可根据实际情况选择
        int bucketNum = max / 10 - min / 10 + 1;
        List buckList = new ArrayList<List<Integer>>();
        // create bucket
        for (int i = 1; i <= bucketNum; i++) {
            buckList.add(new ArrayList<Integer>());
        }
        // push into the bucket
        for (int i = 0; i < arr.length; i++) {
            int index = indexFor(arr[i], min, 10);
            ((ArrayList<Integer>) buckList.get(index)).add(arr[i]);
        }
        ArrayList<Integer> bucket = null;
        int index = 0;
        for (int i = 0; i < bucketNum; i++) {
            bucket = (ArrayList<Integer>) buckList.get(i);
            insertSort(bucket);
            for (int k : bucket) {
                arr[index++] = k;
            }
        }

    }

    // 把桶內元素插入排序
    private void insertSort(List<Integer> bucket) {
        for (int i = 1; i < bucket.size(); i++) {
            int temp = bucket.get(i);
            int j = i - 1;
            for (; j >= 0 && bucket.get(j) > temp; j--) {
                bucket.set(j + 1, bucket.get(j));
            }
            bucket.set(j + 1, temp);
        }
    }
}

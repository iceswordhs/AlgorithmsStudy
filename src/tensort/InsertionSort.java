package tensort;

/*
    插入排序
    时间复杂度：O(n^2)
    空间复杂度：O(1)
    稳定
 */
public class InsertionSort {
    public void insertionSort(int[] arr){//
        int preIndex,temp;
        for(int i=1;i<arr.length;i++)//遍历第2个到最后一个元素
        {
            preIndex=i-1;//已排序的最后一个元素
            temp=arr[i];//需要插入的元素
            while(preIndex>=0&&temp<=arr[preIndex]){//当插入的元素大于已排列的元素时，已排列元素后移一位
                arr[preIndex+1]=arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1]=temp;//arr[preIndex]要么是preIndex==0要么是temp>arr[preIndex]
        }
    }
}

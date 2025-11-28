package tensort;

/*
    计数排序：
    时间复杂度：O(n+k)
    空间复杂度：O(n+k)
    稳定
 */
public class CountingSort {
    public void countingSort(int[] arr,int maxValue){
        int[] bucket=new int[maxValue+1];

        for(int i=0;i<arr.length;i++){
            bucket[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<=maxValue;i++){
            while(bucket[i]>0){
                arr[index++]=i;
                bucket[i]--;
            }
        }
    }
}

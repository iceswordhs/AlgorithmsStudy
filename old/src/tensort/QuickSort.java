package tensort;

/*
    快速排序
    时间复杂度：O(nlogn) 大部分情况下在nlogn中最快，处理大数据最快的几种排序算法之一
    空间复杂度：O(nlogn)
    不稳定
    基本步骤：
    当数组值个数有两个或两个以上时(left<right)，不断对数组根据基准值进行分裂
    以第一个数为基准值，遍历数组，如果元素小于基准值，将元素与当前数组中第一个大于基准值的元素交换(swap(arr,i,index++))
 */
public class QuickSort {
    public void quickSort(int[] arr){
        int left=0;
        int right=arr.length-1;
        quickSort(arr,left,right);
    }

    //private void quickSort(int[] arr, int left, int right) {
    //    if(left<right){
    //        int pivot=partition(arr,left,right);
    //        quickSort(arr,left,pivot-1);
    //        quickSort(arr,pivot+1,right);
    //    }
    //}

    private void quickSort(int[] arr,int left,int right){
        if(left<right){
            int pivot=partition(arr, left, right);
            quickSort(arr, left, pivot-1);
            quickSort(arr, pivot+1, right);
        }
    }

    public int partition(int[] arr,int left,int right){
        int pivot=left;
        int index=pivot+1;
        for (int i = index; i <= right; i++) {
            if(arr[i]<arr[pivot]){//每有一个元素小于基准值，都将它放到前面
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);//把基准值放到中间 index-1是最后一个小于arr[index]的元素，
                                  //交换之后，index-1之前都是小于基准值的，index-1之后都是大于等于基准值的
        return index-1;
    }
    public void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

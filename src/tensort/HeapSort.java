package tensort;

/*
    堆排序
    时间复杂度：O(nlongn)
    空间复杂度：O(1)
    不稳定
    步骤：从底向上遍历所有非叶子节点，如果其子节点大于它，就进行交换，使得整个数组满足大根堆结构
         从后到前，将根节点和数组最后一个节点交换，让当前树的最大值放到数组后部，每次交换完，都重新使根节点满足大根堆结构
         由于刚开始就进行了大根堆，因此堆的下部不会有大于堆上部的值，因此堆一直都满足大根堆结构
 */
public class HeapSort {
    int len;
    public void hearSort(int[] arr){
        maxHeap(arr);

        for(int i= arr.length-1;i>=0;i--){
            swap(arr,0,i);//将最大值放到数组末尾
            len--;
            heapify(arr,0);
        }
    }

    private void maxHeap(int[] arr) {
        len=arr.length;
        for(int i=(len>>1)-1;i>=0;i--){//从底向上遍历所有非叶子节点
            heapify(arr,i);
        }
    }

    private void heapify(int[] arr, int i) {
        int left=i*2+1;
        int right=i*2+2;
        int largest=i;
        if(left<len&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<len&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,largest);//
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

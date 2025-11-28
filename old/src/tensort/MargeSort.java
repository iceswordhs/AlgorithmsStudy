package tensort;

/*
    归并排序
    时间复杂度：O(nlogn)
    空间复杂度：O(n)
    稳定
 */
public class MargeSort {
    public void margeSort(int[] arr){
        int[] temp=new int[arr.length];
        margeSort(arr,0,arr.length-1,temp);//对整个数组进行排序
    }

    private void margeSort(int[] arr, int left, int right, int[] temp) {
        if(right>left){//当数组元素个数至少有两个时，对数组进行排序
            int mid=left+(right-left)/2;
            margeSort(arr,left,mid,temp);//对右边进行排序
            margeSort(arr,mid+1,right,temp);//对左边进行排序
            if(arr[mid]<=arr[mid+1]){//如果arr[mid]<=arr[mid+1]，则整个数组都是有序的，不需要再合并
                return;
            }
            marge(arr,left,mid,right,temp);//将两边合起来
        }
    }

    private void marge(int[] arr, int left, int mid, int right, int[] temp) {
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[t++]=arr[i++];
            }else {
                temp[t++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[t++]=arr[i++];
        }
        while(j<=right){
            temp[t++]=arr[j++];
        }
        t=0;
        while(left<=right){//将排序后的数组写入原数组
            arr[left++]=temp[t++];
        }
    }
}

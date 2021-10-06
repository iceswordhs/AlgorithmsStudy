package tensort;

/*
* 冒泡排序
* 时间复杂度为n*n，
* 空间复杂度为O(1),
* 稳定(即两个相等的数并不会交换顺序)
*/
public class BubbleSort {
    public void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

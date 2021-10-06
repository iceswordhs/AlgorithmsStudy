package tensort;
/*
    希尔排序
    时间复杂度：O(n^1.3)
    空间复杂度：O(1)
    不稳定
 */
public class ShellSort {
        public void shellSort(int[] arr){
            int len=arr.length;
            for (int gap = (int)Math.floor(len/2); gap > 0; gap=(int)Math.floor(gap/2)) {
                for (int i = gap; i < len; i++) {
                    int j=i;
                    int current=arr[i];
                    while(j-gap>=0&&current<arr[j-gap]){
                        arr[j]=arr[j-gap];
                        j=j-gap;
                    }
                    arr[j]=current;
                }
            }
        }
}

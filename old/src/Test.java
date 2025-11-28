import tensort.*;

import java.util.Arrays;

public class Test {
    private static int[] arr={11,54,56,88,38,894,51};

    public static void main(String[] args) {
//        BubbleSort bubbleSort=new BubbleSort();//冒泡排序
//        bubbleSort.bubbleSort(arr);

//        SelectSort selectSort=new SelectSort();//选择排序
//        selectSort.selectSort(arr);

//        InsertionSort insertionSort=new InsertionSort();//插入排序
//        insertionSort.insertionSort(arr);

//        ShellSort shellSort=new ShellSort();//希尔排序
//        shellSort.shellSort(arr);

//        MargeSort margeSort=new MargeSort();//归并排序
//        margeSort.margeSort(arr);

//        QuickSort quickSort=new QuickSort();//快排
//        quickSort.quickSort(arr);


//        HeapSort heapSort=new HeapSort();//堆排序
//        heapSort.hearSort(arr);

//        CountingSort countingSort=new CountingSort();
//        countingSort.countingSort(arr,894);

        int[][] a=new int[2][3];
        int[][] b=new int[][]{{1,2,3,4},{4,4,4},{8,8,8,8,8,8}};
//        for(int i=0;i<a.length;i++){//可以将a的所有值赋为1
//            for(int j=0;j<a[i].length;j++){
//                a[i][j]=1;
//            }
//        }
//        a[1][1]=0;
//        System.out.println(Arrays.toString(a[1]));

        //System.out.println(a.length);//2
        System.out.println(b.length);//3
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].length);//4 3 6
        }

//        for(int i:arr){
//            System.out.print(i+" ");
//        }
    }
}

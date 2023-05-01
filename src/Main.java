import java.util.Scanner;

import dataStructures.MaxHeap;
import dataStructures.MinHeap;
import dataStructures.MyLinkedList;

class Main {
    public static void main(String[] args) {
        long start_time = System.nanoTime();
        int[] array = {11, 14, 1, 4, 23, 53, 31, 9, -2, 34, 101, -99};
        // MergeSort mergeSort = new MergeSort();
        // mergeSort.mergeSort(array);
        // 1395700

        // QuickSort quickSort = new QuickSort();
        // quickSort.quickSort(array, 0, array.length -1);
        // 1527100 nanoSeconds
        
        // BubleSort bubleSort = new BubleSort();
        // bubleSort.bubleSort(array);
        // 1729300 nanoSeconds


        MaxHeap maxHeap = new MaxHeap(array.length);

        for (int i = 0; i < array.length; i++) 
            maxHeap.insert(array[i]);
        
        maxHeap.print();

        // long finish_time = System.nanoTime();

        // long range = finish_time - start_time;
        // System.out.println("Range is: " + range);


    }
    
}
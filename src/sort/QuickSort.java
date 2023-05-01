package sort;
public class QuickSort {
    public void quickSort(int[] arr, int l, int r) {

        if (l >= r)
            return;

        int pi = partition(arr, l, r);
        quickSort(arr, l, pi-1);
        quickSort(arr, pi+1, r);
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int ptr = l-1;
        for (int i = l; i < r; i++) {
            if(arr[i] < pivot){
                ptr++;
                swap(arr, ptr, i);
            }
        }

        swap(arr, ptr + 1, r);
        return ptr+1;
    }

    private void swap(int[] arr, int ptr, int i) {
        int temp = arr[ptr];
        arr[ptr] = arr[i];
        arr[i] = temp;
    }   
}

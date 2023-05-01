package sort;
public class MergeSort {
    public void mergeSort(int[] array) {
        int n = array.length;
        if(n == 1) return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int k = 0; k < mid; k++) 
            left[k] = array[k];
        for (int k = mid; k < n; k++) 
            right[k - mid] = array[k];
        
        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    public void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int l = left.length;
        int r = right.length;
        int index = 0;

        while(i < l && j < r) {
            if(left[i] < right[j]) {
                array[index] = left[i];
                i++;
                index++;
            }
            else {
                array[index] = right[j];
                j++;
                index++;
            }
        }

        for (int k = i; k < l; k++) 
            array[index++] = left[k];
        for (int k = j; k < r; k++) 
            array[index++] = right[k];

    }

}

package dataStructures;

public class MaxHeap {
    int[] heap;
    int size;
    public int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heap = new int[maxSize];
        size = 0;
    }

    private int parent(int pos) {
        return (pos-1) / 2;
    }

    private int leftChild(int pos) {
        return (pos+1)*2;
    }

    private int rightChild(int pos) {
        return (pos+2)*2;
    }
    
    private boolean isLeaf(int pos) {
        return pos > size/2 && pos <= size;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void maxHeapify (int pos) {

        if (isLeaf(pos))
            return;

        if(heap[pos] < leftChild(pos) || heap[pos] < rightChild(pos)) {
            if(heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
        }
    }

    public void insert(int num) {
        if (size >= maxSize) 
			return;
		
        heap[size] = num;
        int current = size;

        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    public void print() {
        for (int i = 0; i < size / 2; i++) {
 
            System.out.print("Parent Node : " + heap[i]);
 
            if (leftChild(i) < size) // if the child is out of the bound of the array
                System.out.print(" Left Child Node: " + heap[leftChild(i)]);
 
            if (rightChild(i) < size) // the right child index must not  be out of the index of the array
                System.out.print(" Right Child Node: " + heap[rightChild(i)]);
            System.out.println(); 
        }
    }


    public int extractMax() {
        int popped = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return popped;
    }
}

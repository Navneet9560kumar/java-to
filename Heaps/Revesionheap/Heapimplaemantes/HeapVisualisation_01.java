package Heaps.Revesionheap.Heapimplaemantes;

class MinHeap {
    private int[] arr;
    private int size;

    MinHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int num) {
        if (size == arr.length) {
            throw new RuntimeException("Heap is full");
        }

        arr[size] = num;
        upheapify(size);
        size++;
    }

    private void upheapify(int idx) {
        if (idx == 0) return;

        int parent = (idx - 1) / 2;

        if (arr[idx] < arr[parent]) {
            swap(idx, parent);
            upheapify(parent);
        }
    }

public int peek() throws Exception {
    if(size == 0) {
        throw new Exception("Heap is Empty");
    }
    return arr[0];
}

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int size() {
        return size;
    }
}

public class HeapVisualisation_01 {

    public static void main(String[] args) throws Exception {

        MinHeap pq = new MinHeap(10);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.peek();

        System.out.println(pq.size());   
    }
}
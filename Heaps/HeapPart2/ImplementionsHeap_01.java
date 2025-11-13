package Heaps.HeapPart2;

class Minheap {
    int[] arr;
    int size;

    Minheap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int num) {
        arr[size++] = num;
        heapifyUp(size - 1);
    }

    private void heapifyUp(int idx) {
        if (idx == 0) return;  // stop at root
        int parent = (idx - 1) / 2;
        if (arr[idx] < arr[parent]) {
            swap(idx, parent);
            heapifyUp(parent);
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int size() {
        return size;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ✅ Peek: sirf top element dekho
    public int peek() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        return arr[0];
    }

    // ✅ Remove (Extract Min)
    public int remove() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        int root = arr[0];
        swap(0, size - 1);
        size--;
        downHeapify(0);
        return root;
    }

    private void downHeapify(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int smallest = idx;

        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != idx) {
            swap(idx, smallest);
            downHeapify(smallest);
        }
    }
}

// ✅ Separate class for testing
public class ImplementionsHeap_01 {
    public static void main(String[] args) {
        Minheap pq = new Minheap(10);
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(1);

        pq.printHeap();  // Initial heap
        System.out.println("Removed: " + pq.remove()); // remove min
        pq.printHeap();  // after removal
    }
}

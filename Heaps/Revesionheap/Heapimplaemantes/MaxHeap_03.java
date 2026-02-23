package Heaps.Revesionheap.Heapimplaemantes;

public class MaxHeap_03 {

    public  static void heapify(int arr[], int n, int i){
      int largest =i;
      int left = 2*i +1;
      int right = 2 * i+2;

      // If left child is greater than root
      if(left<n && arr[left]>arr[right]){
            largest =left;

      }
       // If right child is greater than current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        // if largset is not root  swap 
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

                    // Recursively heapify the affected subtree
            heapify(arr, n, largest);
    }
}

      public static void main(String[] args) {
            
      }
}

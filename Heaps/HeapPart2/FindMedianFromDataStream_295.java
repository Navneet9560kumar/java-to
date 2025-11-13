package Heaps.HeapPart2;

import java.util.*;

public class FindMedianFromDataStream_295 {

  List<Integer> arr = new ArrayList<>();
  

       public  MedianFinder() {
        arr = new ArrayList<>();
    }
    
    public void addNum(int num) {
      arr.add(num);
      int i = arr.size()-1;
      while (i>0) {
        if(arr.get(i)<arr.get(i-1)){
          swap(i,i-1);
          i--;
        }
        else break;
      }
        
    }

    public void swap(int i,  int j){
      int temp = arr.get(i);
      arr.set(i, arr.get(j));
      arr.set(j, temp);
    }
    
    public double findMedian() {
        Collections.sort(arr);
        int n = arr.size();
        if(arr.size()%2==0) return arr.get(n/2);
        else return (arr.get(n/2) + arr.get(n/2 - 1))/2.0;
    }
      
      public static void main(String[] args) {
            
      }
}

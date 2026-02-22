package Heaps.Revesionheap;

import java.util.ArrayList;

public class ImplementheapKunal_07 {

     static class Heap<T extends Comparable<T>>{
                  private ArrayList<T>list;

              public Heap(){
                  list = new ArrayList<>();
              }  
              
              private void swap(int frist, int second){
                 T temp= list.get(frist);
                 list.set(frist,list.get(second));
                 list.set(second,temp);

              }

              private int parent(int index){
                  return (index -1)/2;
              }
               private int left(int index){
                  return (index*2)+1;
              }
              private int right(int index){
                  return index*2+2;
              }

              public void insert(T value){
                  list.add(value);
                  upphead(list.size()-1);


              }

              private void upphead(int index){
                  if(index== 0) return ;
                  int p = parent(index);
                  if(list.get(index).compareTo(list.get(p))<0){
                        swap(index, p);
                        upphead(p);
                  }
              }

              public T remove() throws Exception{
                  if(list.isEmpty()){
                        throw new Exception("Removing a empty heap!");
                  }
                  T temp = list.get(0);
                  T last = list.remove(list.size()-1);
                  if(!list.isEmpty()){
                        list.set(0, last);
                        downheap(0);
                  }
                    return temp;
              }
              private void downheap(int index){
                  int min = index;
                  int left =left(index);
                  int right=  right(index);

                  if(left< list.size() && list.get(min).compareTo(list.get(left))>0){
                        min = left;
                  }
                  
                  if(right< list.size() && list.get(min).compareTo(list.get(right))>0){
                        min = right;
                  }
                  if(min!=index){
                        swap(min, index);
                        downheap(min);
                  }
              }


              public ArrayList<T> heapSort() throws Exception{
                  ArrayList<T> data = new ArrayList<>();

                  while (!list.isEmpty()) {
                        data.add(this.remove());
                  }
                  return data;
              }
            
            
      
      }
     public static void main(String[] args) throws Exception {

    Heap<Integer> heap = new Heap<>();

    // Insert elements
    heap.insert(40);
    heap.insert(10);
    heap.insert(30);
    heap.insert(50);
    heap.insert(20);

    System.out.println("Removing elements from Min Heap:");

    // Remove all elements
    while (true) {
        try {
            System.out.print(heap.remove() + " ");
        } catch (Exception e) {
            break;
        }
    }
}
}

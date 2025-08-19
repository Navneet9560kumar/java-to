package Sorting.REVSort;

import java.util.*;

public class MoveZero__283 {

        public void moveZeroes(int[] arr){
            // saluction 1
            // ArrayList<Integer>arr = new ArrayList();
            
            // int noz =0;
            // for(int ele : nums){
            //       if(ele!=0)arr.add(ele);
            //       else noz++;
            // }
            // for (int i = 0; i <=noz; i++) {
            //       arr.add(0);
            // }
            // for(int i=0; i<nums.length;i++){
            //       nums[i] = arr.get(i);
            // }

            // saluction2

            int noz =0;
            int n = arr.length;
            for(int ele : arr){
                  if(ele==0) noz++;

            }
            for(int  x =0; x<noz; x++){
                  for (int i = 0; i < n-1-x; i++) {
                        if(arr[i]==0){
                              int temp = arr[i];
                              arr[i] = arr[i+1];
                              arr[i+1] =temp;
                  }
                  }
                  
            }

        }
      public static void main(String[] args) {
            
      }
}

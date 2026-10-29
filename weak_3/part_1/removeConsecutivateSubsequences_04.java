package weak_3.part_1;

import java.util.*;

public class removeConsecutivateSubsequences_04 {


      public  static int[]remove(int[]arr){
            Stack<Integer>st = new Stack<>();
            int n=arr.length;
            for(int i=0; i<n;i++){
                  if(st.size()==0) st.push(arr[i]);
                 else if(st.peek()!=arr[i])st.push(arr[i]);
                  if(i==n-1 || arr[i]!=arr[i+1]){
                        st.pop();
                  }
                  
            }
           int [] res= new int[st.size()];
           int m = res.length;
           for(int i=m-1;i>=0;i++){
            arr[i] = st.pop();
           }

           for(int i=0;i<res.length;i++){
            System.out.println(res[i] + " ");
           }
           return  res;
      }
      public static void main(String[] args) {
            int []arr = {1,2,23,10,10,4,4,4,5,7,7,2};
            int[]res =remove(arr);
      }
}

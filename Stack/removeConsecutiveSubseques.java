package Stack;

import java.util.Stack;

public class removeConsecutiveSubseques {

      public static int[] remove(int[]arr){
            int n = arr.length;
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++){
                  if(st.size()==0|| st.peek()!=arr[i])
                   st.push(arr[i]);
                  else if(arr[i]==st.peek()){
                        if(i==n-1 || arr[i]!=arr[i+1]) st.pop();// do nothing 
                   }
       
            }
            int[]res = new int[st.size()];
            int  m  = res.length;
            for(int i=m-1;i>=0;i--){
                  res[i]= st.pop();
            }
            return res ;
      }




      public static void main(String[] args) {
            int []arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
            int[]res= remove(arr);
            for(int i=0;i<res.length;i++){
                  System.out.println(res[i] + " ");
            }
      }
}


// so aasa seen hai ke ham dublulate hai to to batana hai to 
// if(st.size()==0) push or if(st.peek()==arr[i]) to isame perblom ye hai ke hamko hatana tha puri tarha se or dubakalicate ko hatana tha to ye hat to jayega per jase 10 hai to vo ek bacche even ke leye to sahi hai per odd ke leye nahi to iska attrent saluction 
// saluction ye hai ke pop karne se pehele dekho ke v same hai ke nahi or uske next wale se commpare karo ke sahi hai ke nahi ok if(arr[i] !=arr[i+1])
//st.pop();
// if(arr[i]==arr[i+1]){
// do nothing 
//}
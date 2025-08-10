package RrvisionArrya;

public class nextGraterelement {
      public static void main(String[] args) {
            int []arr = {12,8,41,37,2,49,16,28,21};
            int n= arr.length;
            int[] ans = new int[n]; 
            
            
            int nge = arr[n-1];
            ans[n - 1] = -1; 
            for(int i= n-2;i>=0;i--){
                  ans[i]=nge;
                  nge = Math.max(nge,arr[i]);
            }

            // ye arrya print ho raha hai or 
            for(int ele: arr){
                  System.out.print(ele+ " ");
            }
            System.out.println();

            // or ye hamara NextGreater element print kar raha ahu 
            for(int ele: ans){
                  System.out.print(ele+ " ");
            }
            System.out.println();
      }
}

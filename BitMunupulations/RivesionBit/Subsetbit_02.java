package BitMunupulations.RivesionBit;

import java.util.*;



public class Subsetbit_02 {

//       public static void subsets(int[] arr){
//         int n = arr.length;
//         int total = 1 << n;   // 2^n

//         for(int i = 0; i < total; i++){
//             for(int j = 0; j < n; j++){

//                 if((i & (1 << j)) != 0){
//                     System.out.print(arr[j] + " ");
//                 }

//             }
//             System.out.println();
//         }
//     }

  public static int[] singleNumber(int[] nums) {

    int xor = 0;

    for(int n : nums){
        xor ^= n;
    }

    int diff = xor & (-xor);

    int a = 0; 
//     int b = 0;  to  ye kaam os trha kar 

    for(int n : nums){

        if((n & diff) == 0){
            a ^= n;
        }

    }

    return new int[]{a};
}
      public static void main(String[] args) {
            int[]arr ={1,2,1,3,2};
            // subsets(arr);
     System.out.println(Arrays.toString(singleNumber(arr)));

      }
}

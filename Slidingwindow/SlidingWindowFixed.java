package Slidingwindow;

public class SlidingWindowFixed {
   public class Test {
    public static void main(String[] args) {
        String num = "13251113333";
        SlidingWindowFixed swf = new SlidingWindowFixed();
        String result = swf.largestGoodInteger(num);
        System.out.println(result);
    }
    }

//     public static void findConsecutive(int[] arr, int k) {
//         int count = 1;

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] == arr[i - 1]) {
//                 count++;
//                 if (count == k) {
//                     for (int j = i - k + 1; j <= i; j++) {
//                         System.out.print(arr[j] + " ");
//                     }
//                     System.out.println();
//                     count = 1; 
//                 }
//             } else {
//                 count = 1;
//             }
//         }
    

 public String largestGoodInteger(String num) {
        String best = "";
        for (int i = 0; i + 2 < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                best = best.compareTo(num.substring(i, i+3)) > 0 ? best : num.substring(i, i+3);
            }
        }
        return best;
    }
}


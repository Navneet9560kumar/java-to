package Patterns.Slidingwindow;

public class day1 {

      public static void slidingwindown(int[]arr){
            int low =0;
            int high =low+1;
            int res =0;
            int n = arr.length;
            int sum =0;
            for(int i=low;i<=high;i++){
                  sum = sum+arr[i];
            }
            while (high<n) {
                  
                  res = Math.max(res,sum);
                  low++;
                  high++;
                 
                  
                  if(high==n) break;
                  sum = sum +arr[high];
                  
                  
            }

        System.out.println("Maximum Sum = " + res);
      }

      // maxsubArray fix size length
         public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        
        int sum = 0;

        // first window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int res = sum;

        // slide the window
        for(int i = k; i < n; i++){
            sum = sum - arr[i-k] + arr[i];
            res = Math.max(res, sum);
        }

        return res;
    }



    // varival code 
    
public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            // shrink window while sum >= target
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

      public static void main(String[] args) {
             int[] arr = {2, 5, 1, 8, 2, 9, 1};

        slidingwindown(arr);
      }
}


/// question 19
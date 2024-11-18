public class one {

      public static int min(int[] arr, int n) {
            int mini = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                  if (arr[i] < mini) {
                        mini = arr[i];
                  }
            }
            return mini;
      }

      public static int max(int[] arr, int n) {
            int maxi = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                  if (arr[i] > maxi) {
                        maxi = arr[i];
                  }
            }
            return maxi;
      }

      public boolean isPalindrome(String s) {

            s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
            int n = s.length();
            for (int i = 0; i < n; i++) {
                  if (s.charAt(i) != s.charAt(n - i - 1)) {
                        return false;
                  }
            }
            return true;
      }

      public static void reversearr(int[] arr) {
            int n = arr.length;
            int[] temp = new int[n];
    
            // Fill the temp array with reversed elements of arr
            for (int i = 0; i < n; i++) {
                temp[i] = arr[n - i - 1];
            }
    
            // Copy temp back to arr
            for (int j = 0; j < n; j++) {
                arr[j] = temp[j];
            }
        }

      //   public int[] sortArray(int[] nums) {
        
        
    
        public static void main(String[] args) {
            int[] arr = {1, 4, 3, 2, 6, 5};
            reversearr(arr);
    
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    } 
public class Twosum {

      private static boolean flag;

      public static int[] twoSum(int[] arr, int target) {
            int[] ans = new int[2];
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {
                        boolean flag = false;
                        if (arr[i] + arr[j] == target) {
                              ans[0] = i;
                              ans[1] = j;// ye sab jo hai vo normal index ke leye hai or ab agr true ya false karna hia
                                         // hai to ham boolean flag lenge or waha true or false karege aase
                              flag = true;
                              break;
                        }
                  }
                  if (flag)
                        break;
            }
            return ans;
      }

      public static void main(String[] args) {
            int[] arr = { 1, 5, 7, -1, 5 };
            int target = 6;
            int[] result = twoSum(arr, target);

            if (result[0] != 0 || result[1] != 0) {
                  System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                  System.out.println("No two sum solution found.");
            }
      }
}

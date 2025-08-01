package BitMunupulations;

public class Trunonkbit {

      public static int ToggleKthbit(int n, int k){
            return n ^ (1 << k);
      }

            public static void main(String[] args) {
            int[] a = {10,9,8,7,6,5,4,3,2,1,0};
            int k = 2; // Example: Toggle 2nd bit
            for (int i : a) {
                  System.out.println("Original: " + i + ", Toggled: " + ToggleKthbit(i, k));
            }
      }

}

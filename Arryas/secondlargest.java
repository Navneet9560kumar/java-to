public class secondlargest {
      public static void main(String[] args) {
            int[]t = {10 ,30, 33, 45, 56 ,43, 65};
            // int target = 33;
            int max = Integer.MIN_VALUE;
            int n = t.length;

            for(int i=0; i<n;i++){
                 
                  max= Math.max(max,t[i]);
            }
            int smx = Integer.MIN_VALUE;
            for(int i=0; i<n;i++){
              if(t[i] !=max) smx = Math.max(smx,t[i]); 
            }
            System.out.println(max);
            System.out.println(smx);
      }
}

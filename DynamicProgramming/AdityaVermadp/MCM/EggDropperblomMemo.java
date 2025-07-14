package DynamicProgramming.AdityaVermadp.MCM;

public class EggDropperblomMemo {

          static int[][] t = new int[11][51];

        
          
    public static int solve(int e, int f) {
      for (int i = 0; i < e; i++) {
            for (int j = 0; j <f; j++) {
                  t[i][j] = -1;
                  
            }
      }
      return eggDrop(e,f);
    }

       public static int eggDrop(int e, int f) {
            // base case 
            if(f==0|| f ==1)return f;
            if(e==1)return f;

            if(t[e][f] != -1) return t[e][f];

            int min =  Integer.MAX_VALUE;

            for(int k=1;k<=f;k++){
                  int breakCase = t[e-1][k-1] != -1 ? t[e-1][k-1]: eggDrop(e-1, k-1);
                  int noBreackcase = t[e][f-k] != -1 ? t[e][f-k] : eggDrop(e,f- k);

                  int temp  =1+ Math.max(breakCase,noBreackcase);
                  min  = Math.min(min,temp);

                  t[e-1][k-1] = breakCase;
                  t[e][f-k] = noBreackcase;
            }
            return t[e][f] = min;
       }

      public static void main(String[] args) {
        int eggs = 2;
        int floors = 4;
        System.out.println("Number of trials when number of eggs is " + eggs +
                " and number of floors is " + floors + ": " + solve(eggs, floors));
    }
}

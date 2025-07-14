package DynamicProgramming.AdityaVermadp.MCM;

public class EggDropperblom {

       public static int solve(int e, int f){
            if(f==0 || f==1) return f;
            if(e==1) return f;

            int min  = Integer.MAX_VALUE;

            for(int k=1;k<=f;k++){
                  int breakCase = solve(e-1,k-1);// egg breack
                  int noBreackcase = solve(e,f-k);// nahi breack hoga 
                  int temp =  1 + Math.max(breakCase, noBreackcase);
                  min  = Math.min(min, temp);
            }
            return min;
       }
     public static void main(String[] args) {
        int eggs = 2;
        int floors = 4;
        System.out.println("Number of trials when number of eggs is " + eggs + 
                           " and number of floors is " + floors + ": " + solve(eggs, floors));
     } 
}

package BitMunupulations.RivesionBit;

public class base_01 {
      // in the bit malupulastion we normal talk about a x or opperaction ok so ab abhi thoda bit hamre bahut s ekaam kam karta ha like jase hamko odd even find to pura logic is like %2==0 and so biut with the help pf the bit we can do a lots off think like odd even check karn ahia  to ham ye dekh lennge ke last mai 0 ya 1 aa raha hia ke nahi lik ethat 



      // ab ham xor ke bare mai padhnge 
      // normal ab ham freqecny count karni hia hashset or counting ka use karte hia per yr vo extra sapace use karta hia or us se kaam kharba hota hia ok to ham isko dur karne ke leye bit manupulastion ka use kar sakte hai 
      //😎😎😎 
      // 💰💰a^a =0 zero kase aaya kuki done same the is lleye same aa gaye  per agr ye differnt hote to ye zero nahi aayega  ab Question is like that 2,2,1, result 1 hai to kase aayega bit ke help se

      // 3= Order matter nahi karta = a ^ b ^ a = b
      public static int xoroppersion(int []arr){
            int ans =0;
            for(int num:arr){
                  ans= ans^num;
            }
            return ans;
      }


//👉 Power of 2 numbers me sirf ek hi 1 hota hai.
//👉 Power of 2 numbers me sirf ek hi 1 hota hai. = n & (n-1) = 0
//Aur agar nahi hai:n & (n-1) ≠ 0
      public static boolean powerTwo(int n){
            if(n<=0)return false;
            return(n&(n-1))==0;
      }

      // swap karna hai ab to batao kase 
      public static void swap(int n, int m){
            n= n^m;
            m= n^m;
            n =n^m;
            System.out.println(n);
            System.out.println(m);

      }
       public static void countbit(int n){
            int count =0;
            while (n>0) {
                  n= n&(n-1);
                  count++;

            }
            System.out.println(count);
       }
      public static void main(String[] args) {
            int []arr={2,2,1};
            // int n= 5;
            // if((n&1)==1) System.out.println("odd");
            // else System.out.println("Even");

            // int n=4;
            // int m=5;
            // swap(n, m);

            System.out.println("The value is a " + xoroppersion(arr));



      }
}

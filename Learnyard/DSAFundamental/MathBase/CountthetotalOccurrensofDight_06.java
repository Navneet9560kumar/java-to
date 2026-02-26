package Learnyard.DSAFundamental.MathBase;

public class CountthetotalOccurrensofDight_06 {
      public static void main(String[] args) {
            int n =13;
            int count =0;
      //      for(int i =1;i<n;i++){
      //           String str = String.valueOf(i);

      //       for (int j = 0; j < str.length(); j++) {
      //           if (str.charAt(j) == '1') {
      //               count++;
      //           }
      //       }
        
      //      }


      for(int i=1;i<=n;i++){
            int num=i;
            while (num!=0) {
                  if(num%10==1){
                        count++;
                  }
                  num = num/10;
            }
      }
      System.out.println(count);
      }
}

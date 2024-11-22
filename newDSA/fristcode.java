package newDSA;

import Pattern.Scanner;

public class fristcode {
       public static int findMax(int num1,int num2, int num3){
            int max;
            if(num1>num2){
                  if(num1>num3){
                        max = num1;
                  }else{
                        max =num3;
                  }
            }else{
                  if(num2>num3){
                        max = num2;
                  }else{
                        max = num3;
                  }
            }
            return max;
      }

public static int chartersize(){
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any charactre");

      ch = Scanner.nextInt().charAt(0);
}




      public static void main(String[] args) {
            System.out.println(findMax(1, 2, 3));
            System.out.println(findMax(5, 8, 9));
      }
}

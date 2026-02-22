package Learnyard.DSAFundamental.StringBasics;

public class InserCharcteratkpostion_08 {

      public static String inserttacharFristpostion(String str, char ch ){
            return ch +str;

      }

       public static String inserttacharlastpostion(String str, char ch ){
            return str +ch;

      }

      public static String inserttacharKpostion(String str, char ch, int k ){
            if(k<0 || k> str.length()){
                  return "Invalid Postion";
            }
            return str.substring(0,k)+ ch + str.substring(k);

      }

      // MOst efficency way is a stringbulder 
      public static void stringbulder(String str){
            StringBuilder sb =  new StringBuilder();
            sb.insert(3, '1');
            System.out.println(sb);
      }


      public static void main(String[] args) {
             String str = "ello";

        System.out.println(inserttacharFristpostion(str, 'H'));
        System.out.println(inserttacharlastpostion("Hell", 'o'));
        System.out.println(inserttacharKpostion("Helo", 'l', 3));
      }
}

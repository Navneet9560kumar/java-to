package OOPS;



class Calcuater{
      public void add(int a, int b){
            System.out.println("int-int argument");
      }

      public void addflot(float a, float b){
              System.out.println("float-float argument");
      }
       public void addduble(double a, double b){
              System.out.println("float-float argument");
      }
}

public class OOOPSlac_3 {
      public static void main(String[] args) {
            Calcuater c = new Calcuater();
            c.add(10,20);
      }
}



// polymorfisam
package OOPS;


class Calulator{
      public void add(int a, int b){
            System.out.println("int-int argument"+ (a+b));
      }

      public void addfloat(float a, float b){
            System.out.println("float-float argument"+ (a+b));
      }
      public void addDouble(double a, double b){
            System.out.println("double-double argument"+ (a+b));
      }



} 

public class Ploymorphism {


      public static void main(String[] args) {
          Calulator c = new Calulator();
          c.add(10,20);
     }
}

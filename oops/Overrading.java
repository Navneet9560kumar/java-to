package OOPS;

class Parent{
      public void property(){
            System.out.println("Land+ cash+Glod");
      }

      public void marry(){
            System.out.println("Arrange Marriage");
      }
}

class Child extends Parent{
      // @Override
      public void marry(){
            System.out.println("SomeOther Gril....sss   ");
      }
}

public class Overrading {
      public static void main(String[] args) {
            Parent p1 = new Parent();
            p1.property();
            p1.marry();

            System.out.println();
            Child c1 = new Child();
            c1.property();
            c1.marry();
      }
}

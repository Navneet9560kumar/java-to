package string;

public class indexof {
      public static void main(String[] args) {
            String s = "Navneeta";
            System.out.println(s.indexOf('a'));
            System.out.println(s.indexOf('z')); 
            // ye aage se padhna  start karta hai 
            System.out.println(s.lastIndexOf('a'));
            // lastIndexOf ye peeche se cout karna start karta hu 
            // next method 👍👍👍👍
            // new method  is " Compare To()" we use this operater for (is useed to compare 2 given string lexogoaphically=>{ye kay hai ab }  ) 
            String a = "abc";
            String b = "zdc";
            System.out.println(a.compareTo(b)); // Output: -3

            String c = "Krishna is grate good";
            System.out.println(c.contains("rate"));
            System.out.println(c.startsWith("Krishna"));
            System.out.println(c.endsWith("Krishna"));
       
      }
}

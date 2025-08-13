 package string;

public class Equaltonotequalto {
      public static void main(String[] args) {
            String s = "abcxyz";// ye true  to de raha hai per is leye nahi kuki chart.. same haii is leye kuki [jab hamne ye likha to to s OR t ko sing keya to s or t dono same ko point kar rahe hai naki dono alaag bana rahe hai is leye ham iska ans true hai 👍 ]
            String t = "abcxyz";
            System.out.println(s == t);

            System.out.println("kuch naye case ._.");
            String r = "abc";// to iska input faluse aaye or 
            r = r+"xyz"; // to is input to abcxyz aayega per ( per fir false aasyega { To aasa is leye jab ham ye karte hai to  r = r+"xyz" to ek new string create hota hai  } )
            System.out.println(s==r);
            System.out.println(s == t);
            System.out.println(s.equals(r));


      }
}

// why Equal= VS == is different
// == (This is equalty operator [or equal to ke leye ye ham use karte hai ] jab ye int, char , bool, ko commper karta hai saho value dega per jab ye string ko commper karta hai to isake maa behan ek ho jati hai {{ or sting mai ye dono ke address ko commpre karta hai (😋😋 in java there is no concept of address but ham samj paye acche se is leye ham  address naam ke words ka use karte hai )}} jab ham isko int a =2 and char ="r" to ye ram kahi daala jayega per string ke case mai address ko commper karte or is se bacahna hai to {{{s.equals() or s.compareTo(c) dono mai se koi bhi  ka use karte }}} )
// = (This is a assignment operator like{a=b}=>[a has no the value of b] agr
// hamko string ko x comparr karna hota hai to ham is ka use kaerte hai )
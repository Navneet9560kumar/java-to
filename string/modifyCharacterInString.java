package string;

public class modifyCharacterInString {
    public static void main(String[] args) {
        java.lang.String s = " Navneet";
        s = s.substring(0, 2) + 'N' + s.substring(3);
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                str += 'a';
            else
                str += s.charAt(i);
        }
        System.out.println(str);

        // we cannot change indirdual q in string we can but we wish lot of time & space
    }
}

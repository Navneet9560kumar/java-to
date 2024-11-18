package string;

public class stringcompress {
      public static void main(String[] args) {
            String s = "aaaagggeeccuuuudehh";
            char[]arr = s.toCharArray();
            String ans = "";
            int i =0,j=0;
            while (j<arr.length) {
                if(arr[j]==arr[i])j++;
                else{
                  ans +=arr[i];
                  int len = j-1;
                  if(len>1)ans += len;
                  i=j;
                } 
            }
            ans +=arr[i];
                  int len = j-1;
                  if(len>1)ans += len;
            System.out.println(ans);
      }
}

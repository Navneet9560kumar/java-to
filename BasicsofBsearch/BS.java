public class BS {
      public static void main(String[] args) {
            int[]arr = {10,23,46,89,91,97,107,140,264};
            int target = 46;
            int n= arr.length;
            int lo=0, hi = n-1;
            boolean flag = false;

            while (lo<=hi) {
                  int mid = (lo+hi)/2;
                  if(arr[mid]==target){
                        flag = true; break;

                  }else if(arr[mid]>target) hi = mid -1;
                  else if(arr[mid]<target)lo = mid +1;
            }
            if(flag==true) System.out.println("Ha bhai target hai");
            else System.out.println("Nahi hai bhai ");
      }

}


/// so TC analysis so  n->n/2-> n/4 -> n/8---------- 2 to last mai vo TC is o(Logn)
/// 
/// https://www.linkedin.com/posts/rahul-choudhary-py_javascript-ugcPost-7352940732984258560-Ha8W?utm_source=share&utm_medium=member_desktop&rcm=ACoAADH6-RgBEcgX1e5TqLVIP71YgLEFoYQn3BE
package Sorting.Advance;

public class merge {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return; // base case

        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Splitting array into two halves
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i]; // Copy first half into a
        }
        for (int i = 0; i < n - n / 2; i++) {
            b[i] = arr[i + n / 2]; // Copy second half into b
        }

        // Recursive calls
        mergesort(a);
        mergesort(b);

        // Merging sorted halves
        merge(a, b, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 80, 30, 50, 20, 60, 70, 40 };
        print(arr);
        mergesort(arr);
        print(arr);
    }
}

// 🟢🟢🟢🟢 this is a divide and conquer tech ok 🟢🟢🟢🟢
// Time and space complexity [n,n/2,n/4,n/8.......1] ya 
// 1,2,3,4.....n/2..n == x= 2 ke power x 
// soo to sseen aasa hai ke 2 ke power hai log le lenge fir vo x aage aa jayega xlog2to over all (logn+1)terms
// 2(l-1).n = 2.(log n+1-1)n
//2nlogn = so TC IS O(nke pow 2logn) merage short ye {best case or Avg case and worste case = O(nlogn)}


// space com =>👩🏻‍🦱👩🏻‍🦱 




// to ham ek arrya banayege or ab kitana bhi bahda ho vo to seen aasa hai ke ek
// badha sa arrya bana lenge [80,10,70,30,60,40,50,20] to kay karege ham purre
// arrya ko part mai brack kardenge jase vo N hai to vo n/2 or n/2 ho jayega
// n/2 ko fir or chhota kar lenge or karte rahege ok fir sab end mai sort mil
// jayega or baad mai vo

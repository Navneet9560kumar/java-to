package Patterns.TowPointer;

import java.util.*;

public class Triplitesum_04 {
     public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);   // Step 1: sort array
        
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate base elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }



    public static ArrayList<String>inversionPaires(int arr[]){
        int n = arr.length;
        ArrayList<String> st = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    st.add("(" + arr[i] + "," + arr[j] + ")");
                }
            }
            
        }
        return st;
    }

    
    private static int mergeSort(int[] arr, int left, int right){
        int count =0;

        if(left<right){
            int mid = (left+right)/2;

            count += mergeSort(arr, left, mid); // left half
            count += mergeSort(arr, mid+1, right); // right half
            count += merge(arr, left,mid, right);
        }
        return count;
    }


     private static int merge(int[] arr, int left, int mid, int right) {
            int[] temp = new int[right -left +1];
            int i=left;
            int j = mid+1;
            int k=0;
            int count =0;

            while (i<=mid && j<= right) {
                if(arr[i]<=arr[j]){
                    temp[k++] =arr[j++];
                }else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);  // 🔥 main inversion logic
            }
            }
            while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return count;
    }



     public static int inversionCount(int arr[]){
          return mergeSort(arr, 0, arr.length - 1);;

        
     }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
}
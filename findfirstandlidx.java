package JavaCodingJourney;

import java.util.Arrays;

public class findfirstandlidx {
    public static void main(String[] args) {
        int [] arr = {2,7,7,7,7,8,9,19};
        int target = 7;
        int[] ans = searchrange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchrange(int []arr,int target) {
        int[] ans = {-1,-1};
        ans[0] = binarysearch(arr, target,true);
        ans[1] = binarysearch(arr, target,false);

        return ans;
    }

    static int binarysearch(int [] arr,int target,boolean findfirst) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start<=end) {
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else {
                ans = mid;

                if(findfirst==true){
                    end= mid-1;
                } 
                else {
                    start = mid+1;
                }
            }
            
            
        }
        return ans;
    }
}

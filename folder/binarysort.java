package folder;
public class binarysort {
    public static void main(String[] args) {
        int [] arr = {1,5,6,7,8,9};
        System.out.println(binarysort(arr, 7));
    }

    static int binarysort(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;

        boolean isasc = arr[start]<arr[end];

        while (start<=end) {
            mid = start+(end-start)/2;

            if(isasc){
                if(target < arr[mid]){
                    end = mid-1;
            }
            else if(target > arr[mid]) {
                start = mid+1;
            }
            if(arr[mid]==target) {
                return mid;
            }
        }
            else{
                if(target < arr[mid]){
                start = mid+1; 
            }
            else if(target > arr[mid]) {
                end = mid-1;
            }

        }
    }
    return -1;

   }

}    


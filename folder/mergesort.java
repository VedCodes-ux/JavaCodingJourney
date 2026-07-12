package folder;

public class mergesort {
    public static void conquer(int [] arr, int si,int mid , int ei) {
        int [] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j] ) {
                temp[k++] = arr[i++];
            } else {
                temp[k++]=arr[j++];
            } 
        } while (i<=mid) {
            temp[k++] = arr[i++];
        } while (j<=ei) {
            temp[k++]= arr[j++];
        }

        for ( k = 0,i=si; k < temp.length; k++,i++) {
            arr[i]= temp[k];
        }
    }
    public static void divide(int [] arr,int si,int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int [] arr = {2,1,3,6,5,7,9,8,};
        int n = arr.length;
        divide(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

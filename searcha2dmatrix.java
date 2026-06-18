import java.util.Arrays;

public class searcha2dmatrix {
    public static void main(String[] args) {
    int[][] matrix = {
    {10, 20, 30, 40},
    {15, 25, 35, 45},
    {27, 29, 37, 48}
    };

    System.out.println(Arrays.toString(searchmatrix(matrix, 35)));
    }

    static int[] searchmatrix(int[][] matrix,int target){
        int row = 0;
        int col = matrix[0].length-1;

        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return new int[]{-1,-1};
        }

        while (row<matrix.length&& col>=0) {
            if(target==matrix[row][col]){
                return new int[]{row,col};
            }
            if(target<matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }

        }
        return new int[]{-1,-1};
    }


}

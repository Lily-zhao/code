package Array;

public class FindNumberIn2DArray {
    public boolean findNumberIn2DArrayfc(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
        int i = matrix.length-1;
        int j = 0;
        while(i>=0&&i<matrix.length&&j>=0&&j<matrix[0].length){
            if(target<matrix[i][j]) i--;
            else if(target>matrix[i][j]) j++;
            else return true;
        }
        return false;
    }
}

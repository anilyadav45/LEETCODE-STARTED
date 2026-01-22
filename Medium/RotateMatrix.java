class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
    //transpose 
    for(int i=0; i<row; i++){
        for(int j= i+1; j<row; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    //to reverse each row after transpose 
    for(int i=0; i<row; i++){
        int left = 0 , right = row - 1;
        while(left < right){
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }
        
    }
}
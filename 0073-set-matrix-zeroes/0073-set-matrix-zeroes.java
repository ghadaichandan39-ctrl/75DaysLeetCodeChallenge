class Solution {
    public void setZeroes(int[][] matrix) {
      int row=matrix.length;
      int col=matrix[0].length;
      boolean firstcol=false;
      for(int r=0;r<row;r++){
        if(matrix[r][0]==0){
            firstcol=true;
        }
        
        for(int c=1;c<col;c++){
            if(matrix[r][c]==0){
                matrix[r][0]=0;
                matrix[0][c]=0;
            }
        }
      }

      for(int r=1;r<row;r++){
        for(int c=1;c<col;c++){
            if(matrix[r][0]==0 || matrix[0][c]==0){
                matrix[r][c]=0;
            }

        }
      }

      if(matrix[0][0]==0){
        for(int c=1;c<col;c++){
            matrix[0][c]=0;
        }
      }

      if(firstcol){
        for(int r=0;r<row;r++){
            matrix[r][0]=0;
        }
      }
    }
}
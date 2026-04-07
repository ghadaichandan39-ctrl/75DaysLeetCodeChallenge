class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    //  HashSet<Integer> map= new HashSet<>();
     for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            // map.add(matrix[i][j]);
            if(matrix[i][j]==target){
                return true;
            }
        }
     }
    //    for(int k:map){
    //     if(k==target){
    //         return true;
    //     }
    //    } 
       return false;  
    }
}
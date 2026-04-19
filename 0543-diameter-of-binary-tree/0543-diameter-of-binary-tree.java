/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftdiameter=diameterOfBinaryTree(root.left);
        int rightdiameter=diameterOfBinaryTree(root.right);
       int maxleft=maxTree(root.left);
       int maxright=maxTree(root.right);
       int selfdiameter=maxleft+maxright;
        int maxdiameter= Math.max(Math.max(leftdiameter,rightdiameter),selfdiameter);
       return maxdiameter;
    }
    public int maxTree(TreeNode root) {
        if(root==null){
            return 0;
        }
       int maxleft=maxTree(root.left);
       int maxright=maxTree(root.right);
       int max=Math.max(maxleft,maxright);
       return max+1;
    }
}
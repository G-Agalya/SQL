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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
           return true;
        }
        if(root.left==null && root.right==null) return true;
        if(root.left==null){
            int h=hight(root.right);
            return (h<=1) && isBalanced(root.right);
        }
        if(root.right==null){
            int h=hight(root.left);
            return (h<=1) && isBalanced(root.left);
        }
        
       int hig=Math.abs(hight(root.left)-hight(root.right));
       if(hig<=1){
        return isBalanced(root.left) && isBalanced(root.right);
       }
       return false;
    }
    public int hight(TreeNode root){
        if(root==null) return 0;
        int l=hight(root.left);
        int r=hight(root.right);
        return 1+Math.max(l,r);
    }
}
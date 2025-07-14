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
    List<Integer> arr=new ArrayList<>();
    List<Integer> arr1=new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        trev(root.left);
        trevr(root.right);
        if(arr.equals(arr1)){
            return true;
        }
        return false;
    }
    void trev(TreeNode root){
        if(root==null){
            arr.add(null);
            return;
        }
        arr.add(root.val);
        trev(root.left);
        trev(root.right);
    }
    void trevr(TreeNode root){
        if(root==null){
            arr1.add(null);
            return;
        }
        arr1.add(root.val);
        
        trevr(root.right);
        trevr(root.left);
    }
}
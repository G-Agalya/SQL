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
    List<Integer> arr1=new ArrayList<>();
    List<Integer> arr2=new ArrayList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        arr1val(p);
        arr2val(q);
        boolean val=comp();
        return val;
    }
    public boolean comp(){
        if (arr1.size() != arr2.size()) return false;

        for (int i = 0; i < arr1.size(); i++) {
            Integer val1 = arr1.get(i);
            Integer val2 = arr2.get(i);

            if (val1 == null && val2 == null) continue;

            if (val1 == null || val2 == null || !val1.equals(val2)) {
                return false;
            }
        }
        return true;
    }
    public void arr1val(TreeNode p){
        inorderp(p);
    }
    public void inorderp(TreeNode p){
        if(p!=null){
          
          arr1.add(p.val);
          inorderp(p.left);
          inorderp(p.right);
        }
        else{
            arr1.add(null);
        }
    }
     public void arr2val(TreeNode q){
        inorderq(q);
    }
    public void inorderq(TreeNode q){
        if(q!=null){
          
          arr2.add(q.val);
          inorderq(q.left);
          inorderq(q.right);
        }
        else{
            arr2.add(null);
        }
    }
}
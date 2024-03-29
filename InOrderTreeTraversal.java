Refer problem statement from 
https://leetcode.com/problems/binary-tree-inorder-traversal/?envType=daily-question&envId=2023-12-09


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> outlist = new ArrayList<Integer>();
        helper(root, outlist);
        return outlist;
    }
    public void helper(TreeNode root, List<Integer> outlist){
        if(root!=null){
            helper(root.left, outlist);
            outlist.add(root.val);
            helper(root.right, outlist);

        }
    }
}

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return getbst(nums, 0, nums.length - 1);
    }
    public TreeNode getbst(int[] nums, int left, int right) {
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode bst = new TreeNode(nums[mid]);
        bst.left = getbst(nums, left, mid - 1);
        bst.right = getbst(nums, mid + 1, right);
        return bst;
    }
}
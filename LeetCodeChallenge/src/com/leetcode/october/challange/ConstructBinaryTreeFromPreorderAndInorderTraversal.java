package com.leetcode.october.challange;

import java.util.HashMap;
import java.util.Map;

import com.letcoode.util.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	private int preI = 0;
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
        Map<Integer,Integer> map = new HashMap<>();
        for( int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        
        return buildTree(preorder, inorder, 0, inorder.length - 1, map);
    }
   
    
    TreeNode buildTree(int[] preorder, int[] inorder, int inorderSIndex, int inorderEIndex, Map<Integer, Integer> map) {
        if(inorderSIndex > inorderEIndex) 
        	return null;
        TreeNode root = new TreeNode(preorder[preI]);
        preI++;
        root.left = buildTree(preorder, inorder, inorderSIndex, map.get(root.val) - 1, map);
        root.right = buildTree(preorder, inorder, map.get(root.val) + 1, inorderEIndex, map);
        return root;
    }

	public static void main(String[] args) {
		int [] preorder = {3,9,20,15,7};
		int []	inorder = {9,3,15,20,7};
		ConstructBinaryTreeFromPreorderAndInorderTraversal andInorderTraversal = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		TreeNode root = andInorderTraversal.buildTree(preorder, inorder);
		System.out.println(root.val);
	}

}

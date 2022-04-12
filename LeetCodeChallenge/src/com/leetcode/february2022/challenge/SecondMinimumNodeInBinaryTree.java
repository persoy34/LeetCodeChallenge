package com.leetcode.february2022.challenge;

import com.letcoode.util.TreeNode;

public class SecondMinimumNodeInBinaryTree {
	int firstSmallestVal ;
	long secondSmallestVal=Long.MAX_VALUE ;

	
	
	public int findSecondMinimumValue(TreeNode root) {
		firstSmallestVal = root.val;
		secondSmallestVal = dfs(root);
		return (int)secondSmallestVal;
	}
	
	private int dfs(TreeNode root) {
		if (root != null) {
			if (firstSmallestVal < root.val && root.val < secondSmallestVal )
				secondSmallestVal = root.val;
			else  if (firstSmallestVal == root.val){
				dfs(root.left);
				dfs(root.right);
			}
		}
		return secondSmallestVal== Long.MAX_VALUE ? -1: (int)secondSmallestVal;
	}
		

	public static void main(String[] args) {
		// root = [2,2,5,null,null,5,7]
		TreeNode root = new TreeNode(5);
		TreeNode node1 = new TreeNode(8);
		root.left= node1;
		TreeNode node2 = new TreeNode(5);
		root.right = node2;
//		TreeNode node3= new TreeNode(5);
//		TreeNode node4 = new TreeNode(7);
//		node2.left= node3;
//		node2.right=node4;
		
		SecondMinimumNodeInBinaryTree minimumNodeInBinaryTree = new SecondMinimumNodeInBinaryTree();
		int result = minimumNodeInBinaryTree.findSecondMinimumValue(root);
		System.out.println(result);

	}

}

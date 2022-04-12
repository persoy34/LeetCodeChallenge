package com.leetcode.october.challange;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.letcoode.util.TreeNode;

public class BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		Stack <TreeNode> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();
		TreeNode current = root;
		 while (current != null || !stack.isEmpty() ) {
			
			while (current != null) {
				stack.push(current);
				current= current.left;
			}
			TreeNode node = stack.pop();
			result.add(node.val);
			current = node.right;
			
			
		}
		return result;
		
	}

	public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
         TreeNode node1 = new TreeNode(2);
         TreeNode node2 = new TreeNode(3);
         root.left= node1;
         node1.right= node2;
         BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
         List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);
         System.out.println(result);

	}

}

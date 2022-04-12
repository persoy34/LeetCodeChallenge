package com.leetcode.october.challange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.letcoode.util.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		queue.offer(root);
		int level = 1;
		while (queue.size() > 0) {
			int size =queue.size();
			List<Integer> temp= new ArrayList<>();
			while (size-- > 0) {
				TreeNode node = queue.poll();
	             if(level%2==0){
	                    temp.add(0,node.val);
	                }else{
	                    temp.add(node.val);
	                }
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
					
			}
			
			result.add(temp);
			level++;
		}
		return result;		
        
    }

	public static void main(String[] args) {
		// [3,9,20,null,null,15,7]
		TreeNode root = new TreeNode(3);
		TreeNode  node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		root.left = node1;
		root.right = node2;
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		node2.left = node3;
		node2.right = node4;
		BinaryTreeZigzagLevelOrderTraversal levelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();
		List<List<Integer>> result = levelOrderTraversal.zigzagLevelOrder(root);
		System.out.println(result);

	}

}

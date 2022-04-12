package com.leetcode.october.challange;

import java.util.ArrayList;
import java.util.List;

import com.letcoode.util.TreeNode;

public class UniqueBinarySearchTrees {

	public List<TreeNode> generateTrees(int n) {
		
		List <TreeNode> result = generateTrees(1, n);
		return result;
	}
	
	public List<TreeNode> generateTrees (int left, int right ){
		List<TreeNode> result = new ArrayList<>();
		if (left > right) {
			result.add(null);
			return result;
		}
		for (int root=left; root<=right; root++) {
			List<TreeNode>leftNode = generateTrees(left, root-1);
			List<TreeNode>rightNode = generateTrees(root+1,right);
			for (TreeNode left_N : leftNode) {
				for (TreeNode right_N: rightNode) {
					TreeNode node = new TreeNode(root);
					node.left=left_N;
					node.right=right_N;
					result.add(node);
				}
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		UniqueBinarySearchTrees binarySearchTrees = new UniqueBinarySearchTrees();
		List<TreeNode> result = binarySearchTrees.generateTrees(3);
		System.out.println(result);

	}

}

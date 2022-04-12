package com.leetcode.february2022.challenge;

import com.letcoode.util.TreeNode;

public class KthSmallestElementInABST {
	int kthSmallestEl=0;
	int index=0;
	public int kthSmallest(TreeNode root, int k) {
		inOrder(root, k);
		return kthSmallestEl;

	}
	
	private void inOrder(TreeNode root, int k) {
			
		if (root == null ) {
			return;
		}
		
		inOrder(root.left, k);
		if (++index == k) {
			kthSmallestEl = root.val;
			return;
		}
		inOrder(root.right, k);
		
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode lchild = new TreeNode(3);
		TreeNode rchild = new TreeNode(6);
		root.left=lchild;
		root.right=rchild;
		TreeNode lchildl= new TreeNode(2);
		TreeNode lchildr = new TreeNode(4);
		lchild.left=lchildl;
		lchild.right=lchildr;
		TreeNode leaf = new TreeNode(1);
		lchildl.left=leaf;
		KthSmallestElementInABST elementInABST = new KthSmallestElementInABST();
		int val = elementInABST.kthSmallest(root, 2);
		System.out.println(val);

	}

}

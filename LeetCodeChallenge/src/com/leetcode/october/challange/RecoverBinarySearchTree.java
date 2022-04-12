package com.leetcode.october.challange;

import com.letcoode.util.TreeNode;

public class RecoverBinarySearchTree {
	private  TreeNode prevNode=null;
	private  TreeNode firstNode=null;
	private  TreeNode secondNode=null;
	
	public void recoverTree(TreeNode root) {
       helper(root);
       int temp=firstNode.val;
       firstNode.val=secondNode.val;
       secondNode.val=temp;
    }
	
	public void helper(TreeNode root) {
		if(root==null){
            return;
        }
                
        helper(root.left);
        
        if(prevNode!=null && prevNode.val>root.val) {    //1st inorder travel
            if(firstNode==null){
                firstNode=prevNode;
            }
            secondNode=root;
        }
        prevNode=root;
        
        helper(root.right);
	}

	public static void main(String[] args) {
		TreeNode root= new TreeNode(3);
		TreeNode node1= new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		root.right= node1;
		root.left = node2;
		
		RecoverBinarySearchTree binarySearchTree = new RecoverBinarySearchTree();
		binarySearchTree.recoverTree(root);

	}

}

package com.letcode.code.challange;


public class DiameterOfBinaryTree {
	TreeNode root; 
	public int diameterOfBinaryTree(TreeNode root2) {
		 /* base case if tree is empty */
        if (root2 == null) 
            return 0; 
  
        /* get the height of left and right sub trees */
        int lheight = height(root2.left); 
        int rheight = height(root2.right); 
  
        /* get the diameter of left and right subtrees */
        int ldiameter = diameterOfBinaryTree(root2.left); 
        int rdiameter = diameterOfBinaryTree(root2.right); 
  
        /* Return max of following three 
          1) Diameter of left subtree 
         2) Diameter of right subtree 
         3) Height of left subtree + height of right subtree + 1 */
        return Math.max(lheight + rheight, 
                        Math.max(ldiameter, rdiameter)); 
  
    }
	/* A wrapper over diameter(Node root) */
    int diameter() { 
        return diameterOfBinaryTree(root); 
    } 
    
    static int height(TreeNode node) 
    { 
        /* base case tree is empty */
        if (node == null) 
            return 0; 
  
        /* If tree is not empty then height = 1 + max of left 
           height and right heights */
        return (1 + Math.max(height(node.left), height(node.right))); 
    } 
    
    public static void main(String args[]) 
    { 
        /* creating a binary tree and entering the nodes */
    	DiameterOfBinaryTree tree = new DiameterOfBinaryTree(); 
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
  
        System.out.println("The diameter of given binary tree is : "
                           + tree.diameter()); 
    } 
  
}

package com.letcode.code.challange;

public class BinaryTree {

	public TreeNode bstFromPreorder(int[] preorder) {
		  if(preorder.length==0)
			     return null;
			    
			    TreeNode t=new TreeNode(preorder[0]);
			    
			    if(preorder.length==1)
			    return t;
			     for(int i=1;i<preorder.length;i++){
			        TreeNode x=t,pre=t;
			         while(x!=null){
			        	 pre=x;
			             if(x.val<preorder[i]) {
			            	 x=x.right;
			             }else{
			            	 x=x.left;
			            }
			        }
			        if(pre.val<preorder[i]){
			             pre.right=new TreeNode(preorder[i]);
			         }
			         else{
			             pre.left=new TreeNode(preorder[i]);
			         }
			     }
			     return t;
	}
	

	public static void main(String[] args) {
		int [] preorder = {8,5,1,7,10,12};
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.bstFromPreorder(preorder);
		
		
	}

}

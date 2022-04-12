package com.leetcode.october.challange;

import com.letcoode.util.TreeNode;

public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p== null && q!=null) || (p!=null && q== null))
        	return false;
        if (p== null && q==null)
        	return true;
        if (p.val != q.val)
        	return false;
        else return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
        			
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

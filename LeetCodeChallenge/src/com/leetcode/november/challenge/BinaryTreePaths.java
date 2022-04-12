package com.leetcode.november.challenge;

import java.util.LinkedList;
import java.util.List;

import com.letcoode.util.TreeNode;

public class BinaryTreePaths {
	
	public List<String> binaryTreePaths(final TreeNode root) {
        final StringBuilder sb = new StringBuilder();
        final List<String> result = new LinkedList<>();
        return traverse(root, sb, result);
    }

    private List<String> traverse(final TreeNode root, final StringBuilder sb,
                                 final List<String> result) {
        if (root != null) {
            int origSize = sb.length();
            if (sb.length() != 0) {
                sb.append("->");
            }
            sb.append(root.val);
            if (root.left == null && root.right == null) {
                //final String s = currentPath.stream().map(Object::toString).collect(Collectors.joining("->"));
                result.add(sb.toString());
            } else {
                traverse(root.left, sb, result);
                traverse(root.right, sb, result);
            }
            sb.delete(origSize, sb.length());
        }
        return result;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node = new TreeNode(2);
		TreeNode node1 = new TreeNode(3);
		root.left=node;
		root.right=node1;
		TreeNode node2= new TreeNode(5);
		node.right=node2;
		BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
		List<String> result = binaryTreePaths.binaryTreePaths(root);
		System.out.println(result);
		
		
	}

}

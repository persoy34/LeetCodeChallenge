package com.leetcode.october.challange;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.letcoode.util.TreeNode;

public class TreeLevelOrderTravel {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        //bfs of the tree(or level order of a tree)
       List<List<Integer>> list = new ArrayList<>();
        if(root ==null)
        {
            return list;
        }
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        while(q.size()!=0)
        {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode top = q.poll();
                temp.add(top.val);
                if(top.left!=null)
                {
                    q.add(top.left);
                }
                if(top.right!=null)
                {
                    q.add(top.right);
                }
            }
            list.add(temp);
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

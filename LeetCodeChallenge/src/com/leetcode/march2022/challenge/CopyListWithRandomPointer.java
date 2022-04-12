package com.leetcode.march2022.challenge;

import java.util.HashMap;
import java.util.Map;

import com.letcoode.util.Node;

public class CopyListWithRandomPointer {
	Map<Node,Node> cacheMap = new HashMap<>();
	public Node copyRandomList(Node head) {
		if (head == null) return head;
		if (cacheMap.containsKey(head))
			return cacheMap.get(head);
		Node copyNode = new Node(head.val);
		cacheMap.put(head, copyNode);
		copyNode.next = copyRandomList(head.next);
		copyNode.random = copyRandomList(head.random);
		return copyNode;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.levon.algorithms.sorting.questions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class BinarySearchTree {
	
	RankNode root = null;
	
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.track(8);
		b.track(9);
		b.track(2);
		b.track(12);
		b.track(6);
		b.track(4);
//		b.track(5);
		b.track(7);
		b.track(1);
		b.track(-3);
		b.track(-5);
//		System.out.println(b.getRankOfNumber(7));
//		System.out.println(b.findMin());
//		System.out.println(b.findMaxRec(b.root));
//		b.levelOrder(b.root);
//		b.preOrder(b.root);
//		b.deleteNode(2);
		System.out.println(b.findDepth(b.root, 0));
		System.out.println(b.findDepth(b.root));
		System.out.println();
		b.findSumPath(29);
	}
	public static void test(BinarySearchTree test) {
		test = null;
	}
	// Breath first search
	public void levelOrder(RankNode root) {
		if(root == null) {
			return;
		}
		Queue<RankNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			RankNode current = queue.peek();
			System.out.print(current.data+" ");
			if(current.leftNode != null) {
				queue.add(current.leftNode);
			}
			if(current.rightNode != null) {
				queue.add(current.rightNode);
			}
			queue.poll();
			
		}
	}
	Stack<RankNode> stack = new Stack<>();
	public void preOrder(RankNode node) {
		if(node == null) {
			return;
		}
//		stack.push(node);
		System.out.print(node.data+" ");
			preOrder(node.leftNode);
			preOrder(node.rightNode);	
		
	}
	
	public void track(int number) {
		if(root == null) {
			root = new RankNode(number);
		}
		else {
			root.insertData(number);
		}
	}
	public int getRankOfNumber(int number) {
		if(root == null) {
			root = new RankNode(number);
			return 1;
		}
		return	root.getRank(number);
		
	}
	public int findMin() {
		if(root == null) {
			return -1;
		}
//		if(root.leftNode == null) {
//			return root.data;
//		}
		RankNode node = root;
		while(node.leftNode != null) {
			node = node.leftNode;
		}
		return node.data;
	}
	
	public int findMaxRec(RankNode node) {
		if(node == null) {
			return -1;
		}
		if(node.rightNode == null) {
			return node.data;
		}
		return findMaxRec(node.rightNode);
	}
	
	public RankNode deleteNode(int data) {
		return deleteNode(data, root);
	}
	private RankNode deleteNode(int data, RankNode node) {
		
		if(node == null) {
			return node;
		}
		else if(data > node.data) {
			node.rightNode = deleteNode(data, node.rightNode);
			return node;
		}
		else if(data < node.data) {
			node.leftNode = deleteNode(data, node.leftNode);
			return node;
		}
		//case 1 - when both left and right nodes are null
		if(node.leftNode == null && node.rightNode == null) {
			node = null;
			return node;
		}
		// case 2 - when either left or right node is null
		else if(node.leftNode == null) {
			node = node.rightNode;
			return node;
		}
		else if(node.rightNode == null) {
			node = node.leftNode;
			return node;
		}
		//case 3 - when neither left nor right node is null
		else {
			node.data = findMaxRec(node.leftNode);
			node.leftNode = deleteNode(node.data, node.leftNode);
			return node;
		}
	}
	
	public void findSumPath(int sum) {
		int[] nodes = new int[findDepth(root)+1];
		findSumPath(root, nodes, sum, 0);
	}
	
	public void findSumPath(RankNode node, int[] nodes, int sum, int level) {
		if(node == null) {
			return;
		}
		int nodesSum = 0;
//		nodes[nodes.length-1] = node.data;
		nodes[level] = node.data;
		for (int i = level; i >= 0; i--) {
			nodesSum += nodes[i];
			if(nodesSum == sum) {
				for (int j = level; j >= i; j--) {
					System.out.println(nodes[j]);
				}
			}
		}
		findSumPath(node.leftNode, nodes, sum, level+1);
		findSumPath(node.rightNode, nodes, sum, level+1);
	}
	
	public int findDepth(RankNode node, int depth) {
		if(node == null) {
			return depth-1;
		}
		depth++;
		return Math.max(findDepth(node.leftNode, depth), findDepth(node.rightNode, depth));
	}
	
	public int findDepth(RankNode node) {
		if(node == null) {
			return -1;
		}
		return 1+Math.max(findDepth(node.leftNode), findDepth(node.rightNode));
	}

}

class RankNode {
	
	RankNode leftNode;
	RankNode rightNode;
	int data;
	int leftSize;
	
	public RankNode(int data) {
		this.data = data;
	}
	
	public void insertData(int d) {
		if(d <= data) {
			if(leftNode != null) {
				leftNode.insertData(d);
				leftSize++;
			}
			else {
				RankNode newNode = new RankNode(d);
				leftNode = newNode;
			}
		}
		else if(d > data) {
			if(rightNode != null) {
				rightNode.insertData(d);
			}
			else {
				RankNode newNode = new RankNode(d);
				rightNode = newNode;	
			}
		}
	}
	
	public int getRank(int d) {
		if(d == data) {
			return leftSize+1;
		}
		if(d < data) {
			if(leftNode != null) {
				return leftNode.getRank(d);
			}
			else {
				return -1;
			}
		}
		else {
			if(rightNode != null ) {
				return rightNode.getRank(d)+leftSize+1;
			}
			else {
				return -1;
			}
		}
	}
	
}

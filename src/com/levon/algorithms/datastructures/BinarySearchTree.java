package com.levon.algorithms.datastructures;

import java.util.Queue;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(4);
		bst.insert(5);
		bst.insert(48);
		bst.insert(1);
		bst.insert(8);
		bst.insert(23);
		bst.inOrderTraversal();
		bst.mirorTree();
		System.out.println("-----");
		bst.inOrderTraversal();
	}
	
	BNode root;
	
	public void insert(int data) {
		root = insert(root, data);
		System.out.println(root);
	}
	
	private BNode insert(BNode root, int data) {
		BNode newNode = createNewNode(data);
		if(root == null) {
			root = newNode;
			System.out.println(root);
			return root;
		}
		else if(data <= root.data) {
			root.left = insert(root.left, data);
		}
		else if(data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}
	
	public int findMin() {
		return findMin(root);
	}
	
	private int findMin(BNode node) {
		if(node == null) {
			return -1;
		}
		if(node.left == null) {
			return node.data;
		}
		return findMin(node.left);
	}
	
	public void levelOrderTraversal(BNode node) {
		if(node == null) {
			System.out.println("tree is empty");
			return;
		}
		Queue<BNode> queue = new java.util.LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			BNode nodeFromQueue = queue.poll();
			System.out.println(nodeFromQueue.data+" ");
			if(nodeFromQueue.left != null) {
				queue.add(nodeFromQueue.left);
			}
			if(nodeFromQueue.right != null) {
				queue.add(nodeFromQueue.right);
			}
		}
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	private void inOrderTraversal(BNode node) {
		if(node == null) {
			System.out.println("tree is empty");
			return;
		}
		inOrderTraversal(node.left);
		System.out.println(node.data);
		inOrderTraversal(node.right);
	}
	
	public void preOderTraversal(BNode node) {
		if(node == null) {
			System.out.println("tree is empty");
			return;
		}
		System.out.println(node.data);
		preOderTraversal(node.left);
		preOderTraversal(node.right);
	}
	
	public void postOderTraversal(BNode node) {
		if(node == null) {
			System.out.println("tree is empty");
			return;
		}
		preOderTraversal(node.left);
		preOderTraversal(node.right);
		System.out.println(node.data);
	}
	
	public int findMinIterative(BNode node) {
		if(node == null) {
			System.out.println("tree is empty");
			return -1;
		}
		while(node.left != null) {
			node = node.left;
		}
		return node.data;
	}
	
	public void mirorTree() {
		mirorTree(root);
	}
	
	private void mirorTree(BNode root) {
		if(root == null) {
			return;
		}
		BNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirorTree(root.left);
		mirorTree(root.right);
	}

	private BNode createNewNode(int data) {
		BNode newNode = new BNode();
		newNode.data = data;
		return newNode;
	}

}

class BNode {
	
	int data;
	BNode left;
	BNode right;
}

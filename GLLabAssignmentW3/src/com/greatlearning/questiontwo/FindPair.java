/**
 * 
 */
package com.greatlearning.questiontwo;

import java.util.HashSet;

/**
 * @author aravind
 *
 */
public class FindPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindPair findPair = new FindPair();
		Node root = null;

		root = findPair.insert(root, 40);
		root = findPair.insert(root, 20);
		root = findPair.insert(root, 60);
		root = findPair.insert(root, 10);
		root = findPair.insert(root, 30);
		root = findPair.insert(root, 50);
		root = findPair.insert(root, 70);

		int inputsum = 100;

		findPair.findPairwithGivenSum(root, inputsum);
	}

	static class Node {

		int data;
		Node left, right;
	}

	static Node addNode(int data) {
		Node tempNode = new Node();

		tempNode.data = data;
		tempNode.left = null;
		tempNode.right = null;

		return tempNode;
	}

	public Node insert(Node root, int key) {

		if (root == null)
			return addNode(key);

		if (key < root.data) {
			root.left = insert(root.left, key);
		} else {
			root.right = insert(root.right, key);
		}
		return root;
	}

	public boolean findPair(Node root, int sum, HashSet<Integer> set) {

		if (root == null) {
			return false;
		}

		if (findPair(root.left, sum, set)) {
			return true;
		}

		if (set.contains(sum - root.data)) {
			System.out.println("\n Pair is found for the sum "+ sum +" : (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else {
			set.add(root.data);
		}
		return findPair(root.right, sum, set);

	}

	public void findPairwithGivenSum(Node root, int sum) {
		HashSet<Integer> hSet = new HashSet<Integer>();

		if (!findPair(root, sum, hSet)) {

			System.out.println("Pair does not Exists");
		}
	}
}

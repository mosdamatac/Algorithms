package problems;

import object.BinaryNode;

public class BinarySearchTree {

	public static void main(String[] args) {
		getDistance(new int[] {5,6,3,1,2,4}, 6, 2, 4);

	}
	
	public static int getDistance(int[] array, int n, int node1, int node2) {
		BinaryNode root = createBinaryTree(array, n);
		
		// find node1 first
		// node curr = temporary node
		// iterate from root and check if node1 < or > root
		// 
		return 0;
	}

	public static BinaryNode createBinaryTree(int[] array, int n) {
		// create BinaryNode root = new BinaryNode(array[0]);
		// iterate through array and create a BinaryNode for each value : 1 -> n-1
			// new node : curr = root
			// new node : value = e
			// boolean set = false
			// while (!set)
				// e < curr.value
					// curr.left != null : curr = curr.left
					// else, curr.left = node e; set = true;
				// e > curr.right
					// curr.right != null : curr = curr.right
					// else, curr.right = node e; set = true;
		
		BinaryNode root = new BinaryNode(array[0]);
		for (int i = 1; i < array.length; i++) {
			BinaryNode curr = root;
			BinaryNode node = new BinaryNode(array[i]);
			boolean set = false;
			
			while (!set) {
				if (node.value < curr.value) {
					if (curr.left != null) {
						curr = curr.left;
					} else {
						curr.left = node;
						set = true;
					}
				} else {
					if (curr.right != null) {
						curr = curr.right;
					} else {
						curr.right = node;
						set = true;
					}
				}
			}
		}
		
		return root;
	}
}

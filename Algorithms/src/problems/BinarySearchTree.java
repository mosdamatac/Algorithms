package problems;

import java.util.*;

import object.BinaryNode;

public class BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree myClass = new BinarySearchTree();
		int[] array = {5,6,3,1,2,4};
		int n = 6;
		int node1 = 1;
		int node2 = 2;
		int distance = myClass.getDistance(array, n, node1, node2);
		System.out.printf("Distance from %d to %d: %d", node1, node2, distance);
	}
	
	public int getDistance(int[] array, int n, int node1, int node2) {
		BinaryNode root = createBinaryTree(array, n);
		List<Integer> visited1 = traverseTree(root, node1);
		List<Integer> visited2 = traverseTree(root, node2);
		
		if (visited1.isEmpty() || visited2.isEmpty()) { return -1; }
		if (node1 == node2) { return 0; }
		
		int min = Math.min(visited1.size(), visited2.size());
		int lcaDistance = 0;
		while ((lcaDistance+1 < min) && visited1.get(lcaDistance+1) == visited2.get(lcaDistance+1)) {
			lcaDistance++;
		}
		
		System.out.printf("v1: %s -- v2: %s -- lca: %d\n", visited1, visited2, lcaDistance);
		return Math.abs((visited1.size() - 1) + (visited2.size() - 1) - (2 * lcaDistance));
	}
	

	
	private List<Integer> traverseTree(BinaryNode root, int node) {		
		BinaryNode curr = root;
		List<Integer> visited = new ArrayList<>();
		
		while (curr != null) {
			visited.add(curr.value);
			if (curr.value == node) {
				return visited;
			}
			
			if (node < curr.value) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		
		return null;
	}

	private BinaryNode createBinaryTree(int[] array, int n) {
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

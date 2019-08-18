package problems;

public class StaircaseOneToKSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ways = numWays(5,4);
		System.out.println("Ways: " + ways);
	}

	/**
	 * 
	 * @param n is number of steps
	 * @param maxSteps is maximum number of steps: 1 -> maxSteps
	 * @return int number of ways to step from bottom to top
	 */
	public static int numWays(int n, int maxSteps) {
		// dynamic programming -- create an array
		// store value of numWays for n in array with n as index and numWays value as element
		
		// n = 3
		// array[4] : 1 1 2 3
		// i = 3
		// 3-1 = 2 : 2
		// 3-2 = 1 : 1
		if (n == 1 || n == 0) { return 1; }
		int[] visitedSteps = new int[n+1];
		visitedSteps[0] = 1;
		visitedSteps[1] = 1;
		
		// nums[i] = nums[i-1] + nums[i-2] + nums[i-3];
		// int sum += num[i+ itration on maxSteps];
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			for (int k = 1; k <= maxSteps && k <= i; k++) {
				sum += visitedSteps[i-k];
			}
			visitedSteps[i] = sum;
			sum = 0;
		}
		
		return visitedSteps[n];
	}
}

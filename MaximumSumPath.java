// JAVA program to find maximum sum path:

public class MaximumSumPath { 
	// Utility function to find maximum of two integers 
	int max(int x, int y) { return (x > y) ? x : y; } 

	
	int maxPathSum(int ar1[], int ar2[], int m, int n) 
	{ 
		// initialize indexes for ar1[] and ar2[] 
		int i = 0, j = 0; 

		
		int result = 0, sum1 = 0, sum2 = 0; 

		
		while (i < m && j < n) { 
			 
			if (ar1[i] < ar2[j]) 
				sum1 += ar1[i++]; 

		 
			else if (ar1[i] > ar2[j]) 
				sum2 += ar2[j++]; 

			
			else { 
				result += max(sum1, sum2) + ar1[i]; 

				 
				sum1 = 0; 
				sum2 = 0; 

				 
				i++; 
				j++; 
			} 
		} 

		// Add remaining elements of ar1[] 
		while (i < m) 
			sum1 += ar1[i++]; 

		// Add remaining elements of ar2[] 
		while (j < n) 
			sum2 += ar2[j++]; 

		// Add maximum of two sums of remaining elements 
		result += max(sum1, sum2); 

		return result; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		MaximumSumPath sumpath = new MaximumSumPath(); 
		int ar1[] = { 3, 6, 7, 8, 10, 12, 15, 18, 100 }; 
		int ar2[] = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 }; 
		int m = ar1.length; 
		int n = ar2.length; 

		// Function call 
		System.out.println( 
			"Maximum sum path is :"
			+ sumpath.maxPathSum(ar1, ar2, m, n)); 
	} 
} 


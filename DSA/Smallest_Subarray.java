//"Given an array of integers and a sum K,
//    return the length of the shortest sub-array which matches the given sum. If it doesn't exist, return -1.
//    [Even a single integer can be considered as a sum.]
//
//Examples:
//    int[] arr = {2, 4, 6, 10, 2, 1}, K = 12        // Return 2
//
//    int[] arr = {5, 8, 50, 4}, K = 50                // Return 50 (A single integer may be considered as a sum)"

package GS.DSA.DSA;

public class Smallest_Subarray {
	public static void main(String[] args) {
		int[] a = {5, 8, 50, 4};
		int k = 50;
		int  sum=0; int min=Integer.MAX_VALUE;
		int n=a.length; int start=0,end;
		    for (end = 0; end < n; end++) {
		    	sum=sum+a[end];
		    	
		    	while(sum>=k) {
		    		if(sum==k) {
		    			min=Math.min(min, end-start+1);
		    		}
		    		sum=sum-a[start];
		    		start++;
		    	}
		    }
		    int ans= (min==Integer.MAX_VALUE)?-1:min;
		    System.out.println(ans);
	}
}

//"Given a sorted array of non-negative integers of size n,
//    return the smallest missing integer.
//
//Examples:
//    int[] arr1 = {1, 2, 3, 4};    // Return 0
//
//    int[] arr2 = {0, 1, 3, 4};    // Return 2"
package GS.DSA.DSA;

public class Missing_element_sorted_array {
	 public static void main(String args[]){

//               Examples:
       int[] arr2 = {0, 2, 3, 4};    // Return 0

       int ans = -1;

       for(int i=0;i<arr2.length;i++){
           if(i != arr2[i]){
               ans = i;
               break;
           }
       }
       System.out.println(ans);
   }
}

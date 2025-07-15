//"Given a sorted rotated array,
//    return the minimum element from it.
//
//Examples:
//    int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1
//
//    int[] arr2 = {1, 2, 3, 4};            //Return 1"

package GS.DSA.DSA;

public class Smallest_element_sorted_array {
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

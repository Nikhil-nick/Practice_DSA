//"Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
//return the final coordinates after traversing the string.
//
//Examples:
//Given (0,0) and String - ""UUU""
//    Answer : (0,3)
//
//Given (0,0) and String - ""URRDDL""
//    Answer : (1,-1)
//
//Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT""
//    Answer : (-1,-1)"

package GS.DSA.DSA;
import java.util.*;
public class Robot_Movement {
	public static int[] finalCoordinates(String instructions) {
		int x = 0, y = 0; String var="";
		String sA[] = instructions.split("\\s+");
		for(String s:sA) {
			int count=1;
			var=s;
			if(s.contains("x")) {
				String sNew[]=s.split("x");
				count=Integer.valueOf(sNew[0]);
				var=sNew[1];
			}
			for(int i=1;i<=count;i++) {
				switch(var) {
				case "UP":
					y++;
					break;
				case "DOWN":
					y--;
					break;
				case "LEFT":
					x--;
					break;
				case "RIGHT":
					x++;
					break;
				}
			}
		}
		return new int[] {x,y};
	}

	public static void main(String[] args) {
		// System.out.println(Arrays.toString(finalCoordinates("UUU"))); // [0, 3]
		 System.out.println(Arrays.toString(finalCoordinates("URRDDL"))); // [1, -1]
		System.out.println(Arrays.toString(finalCoordinates("5xRIGHT 5xLEFT"))); // [-1, -1]
	}
	
}


//class Solution {
//	  public static void main(String[] args) {
//	    String str="DOWN UP 2xRIGHT DOWN 2xLEFT";
//	    String s[]=str.split("\\s+");
//	    int arr[]=new int[2]; int x=0,y=0;
//	    for(int i=0;i<s.length;i++){
//	      int count=1;
//	      if(s[i].contains("x")){
//	        String sA[]=s[i].split("x");
//	        count=Integer.valueOf(sA[0]);
//	        s[i]=sA[1];
//	      }
//	      for(int j=1;j<=count;j++){
//	         assign(s[i],arr);
//	      }
//	    }
//	    
//	System.out.println("truee "+ x+" "+ y);
//	    //System.out.println(ans);
//	    System.out.println(Arrays.toString(arr));
//	  }
//	  public static void assign(String s, int[] a){
//
//	 if(s.equals("DOWN")){
//	          a[1]--;
//	        }else if(s.equals("UP")){
//	a[1]++;
//	        }else if(s.equals("RIGHT")){
//	a[0]++;
//	        }else if(s.equals("LEFT")){
//	a[0]--;
//	        }
//	  }
//	}
//

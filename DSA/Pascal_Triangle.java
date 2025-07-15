//"Pascal Triangle
//        generate the Pascal Triangle, OR
//        generate a specified row of the Pascal Triangle, OR
//        calculate the element at a specified row and column."

package GS.DSA.DSA;
import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
	
		public static List<List<Integer>> generate(int numRows) {
			List<List<Integer>> result = new ArrayList();
			if (numRows == 0)
				return result;
			List<Integer> firstRow = new ArrayList<>();
			firstRow.add(1);
			result.add(firstRow);
			
			for (int i = 1; i < numRows; i++) {
				List<Integer> lastRow = result.get(i - 1);
				List<Integer> row = new ArrayList<>();
				row.add(1);
				for (int j = 0; j < i - 1; j++) {
					row.add(lastRow.get(j) + lastRow.get(j + 1));
				}
				row.add(1);
				result.add(row);
			}
			return result;
		
	}

    public static void main(String[] args) {
        
        System.out.println(generate(5));         // false
    }
}

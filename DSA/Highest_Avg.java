/*
 "Given a list of student names and corresponding marks,
    return the highest average marks (and print the corresponding student name - optional).
    The marks can be negative as well and a student may have multiple marks.

Example:
 String[][] = {{“Charles”, 84},
                      {“John”, 100},
                      {“Andy”, 37},
                      {“John”, 23},
                      {“Charles”, 20}};

    //Return 61.5 (which is of John's)"
*/
package GS.DSA.DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Highest_Avg {

	public static double highestAverage(String[][] marksList) {
		Map<String, Integer> totalMarks = new HashMap<>();
		Map<String, Integer> counts = new HashMap<>();

		for (String[] entry : marksList) {
			String name = entry[0];
			int marks = Integer.parseInt(entry[1]);

			totalMarks.put(name, totalMarks.getOrDefault(name, 0) + marks);
			counts.put(name, counts.getOrDefault(name, 0) + 1);
		}

		double maxAverage = Double.NEGATIVE_INFINITY;
		String topStudent = "";

		for (String student : totalMarks.keySet()) {
			double average = (double) totalMarks.get(student) / counts.get(student);

			if (average > maxAverage) {
				maxAverage = average;
				topStudent = student;
			}
		}

		System.out.println("Top student: " + topStudent + " with average: " + maxAverage);

		return maxAverage;
	}

	public static void main(String[] args) {
		String[][] marksList = {
				{"Charles", "84"},
				{"John", "100"},
				{"Andy", "37"},
				{"John", "23"},
				{"Charles", "20"}
		};

		double highestAvg = highestAverage(marksList);
		System.out.println("Highest Average: " + highestAvg);  // Output: 61.5
	}
}
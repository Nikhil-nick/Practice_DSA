/*
 "A group of students are sitting in a circle. The teacher is electing a new class president. The teacher does this by singing a song while walking around the circle. After the song is finished the student at which the teacher stopped is removed from the circle. Starting at the student next to the one that was just removed, the teacher resumes singing and walking around the circle. After the teacher is done singing, the next student is removed. The teacher repeats this until one student is left.
A song of length k will result in the teacher walking past k students on each round. The students are numbered 1 to n. The teacher starts at student 1.
For example, suppose the song length is two(k=2). And there are four students to start with (1,2,3,4). The first student to go would be '2', after that '4', and after that '3’. Student '1' would be the next president in this example.

    n - the number of students sitting in a circle
    k - the length (in students) of each song.

return the number of the student that is elected."
*/
package GS.DSA.DSA;

import java.util.ArrayList;

public class Josephus_Problem {
	public static void main(String[] args) {

		int n = 5, k = 2;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		
		int idx = 0;
		while (list.size() > 1) {
			idx = (idx + (k - 1))%list.size();
			list.remove(idx);
		}
		 System.out.println(list.get(0)+1);

	}

}

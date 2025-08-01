/*
"Given a dictionary (list of words) and a word,
    return an array of strings that can be formed from the given word.
    [Every letter in the input word can occur only once in the word to be returned].

Examples:
    String[] dict = {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acb"", ""acab""};
    String input = ""abcd"";
    // Return {""abcd"", ""bcad""}

    String[] dict =  {""ab"", ""abcd"", ""bcdaf"", ""bcad"", ""acaab"", ""acab""};
    String input = ""caab"";
    // Return {""acab""}"
*/
package GS.DSA.DSA;

import java.util.ArrayList;
import java.util.List;

public class Q17_Dict {
	public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] arr = new int[26]; 

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;  
            arr[t.charAt(i) - 'a']--;  
        }

        for (int count : arr) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acbd", "acab"};
        String input = "abcd";
        
        answerr(dict,input);
       

    }

	private static void answerr(String[] dict, String input) {
		List<String> list=new ArrayList<String>();
		
		for(String var:dict) {
			if(isAnagram(var,input)) {
				list.add(var);
			}
		}
		
		System.out.println(list);
	}
}

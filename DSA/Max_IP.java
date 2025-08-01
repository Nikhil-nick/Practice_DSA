/*
 "Given an array of strings,
    return the IP address that occurs maximum number of times.
    [You might have to check for the validity of the IP address before considering it].

Example:
    String [] str = {
                              ""10.0.0.1 bytes=32 time=50ms TTL=63"",
                              ""10.0.0.2 bytes=32 time=50ms TTL=73"",
                              ""10.0.0.4 bytes=32 time=50ms TTL=83"",
                              ""10.0.0.2 bytes=32 time=50ms TTL=93"",
                            }

    // Return 10.0.0.2"
*/
package GS.DSA.DSA;

import java.util.HashMap;
import java.util.Map;

public class Max_IP {

	    public static String mostFrequentIP(String[] logs) {
	        Map<String, Integer> countMap = new HashMap();
	        String maxIP = "";
	        int maxCount = 0;

	        for (String log : logs) {
	            // Split the string by spaces
	            String[] parts = log.split(" ");
	            for (String part : parts) {
	                if (isValidIP(part)) {
	                    countMap.put(part, countMap.getOrDefault(part, 0) + 1);
	                    if (countMap.get(part) > maxCount) {
	                        maxCount = countMap.get(part);
	                        maxIP = part;
	                    }
	                }
	            }
	        }
	        return maxIP;
	    }

	    // Method to validate an IPv4 address without regex
	    private static boolean isValidIP(String ip) {
	        String[] segments = ip.split("\\.");
	        if (segments.length != 4) return false;

	        for (String seg : segments) {
	            if (seg.length() == 0 || seg.length() > 3) return false;

	            // Check if all chars are digits
	            for (char c : seg.toCharArray()) {
	                if (!Character.isDigit(c)) return false;
	            }

	            int num = Integer.parseInt(seg);
	            if (num < 0 || num > 255) return false;

	            // Avoid leading zeros like "01" or "001"
	            if (seg.length() > 1 && seg.charAt(0) == '0') return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        
	        String[] logs = {
	            "10.0.0.1 bytes=32 time=50ms TTL=63",
	            "10.0.0.2 bytes=32 time=50ms TTL=73",
	            "10.0.0.4 bytes=32 time=50ms TTL=83",
	            "10.0.0.2 bytes=32 time=50ms TTL=93",
	        };
	        System.out.println("Most frequent IP: " + mostFrequentIP(logs));
	    }
	}

package Recursion;

import java.util.Scanner;

public class permutations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String us = scan.next();
        String s = "";  // Initially empty string
        allPermutations(s,us);
//        String ans = allPermutations(s, us);
//        System.out.println(ans);
        // Call the method to print permutations
    }

    static void allPermutations(String s, String us) {
        if (us.isEmpty()) {
            System.out.println(s);  // Base case: print the permutation
        } else {
            char ch = us.charAt(0);
            for (int i = 0; i <= s.length(); i++) {
                // Generate new string by inserting the character 'ch' at different positions in 's'
                String newStr = s.substring(0, i) + ch + s.substring(i);
                allPermutations(newStr, us.substring(1));
            }
        }
    //    }
//    static String allPermutations(String s, String us) {
//        if (us.isEmpty())
//        {
//            return s;  // Base case: return the permutation when 'us' is empty
//        } else
//        {
//            String result = "";  // String to accumulate all permutations
//            char ch = us.charAt(0);
//            for (int i = 0; i <= s.length(); i++) {
//                // Generate new string by inserting the character 'ch' at different positions in 's'
//                String newStr = s.substring(0, i) + ch + s.substring(i);
//                // Recursively call and accumulate the result
//                result += allPermutations(newStr, us.substring(1));
//            }
//            return result;  // Return the accumulated permutations
//        }
    }
}

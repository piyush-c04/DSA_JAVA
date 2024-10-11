package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class pncusingarraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String us = scan.next();
        String s = "";  // Initially empty string
        ArrayList<String> ans = new ArrayList<>();
        ans = allPermutations(s, us);
        System.out.println(ans);
    }


    static ArrayList<String> allPermutations(String s, String us) {
        ArrayList<String> list = new ArrayList<>();
        if (us.isEmpty()) {
            list.add(s);  // Base case: print the permutation
        }
        else
        {
            char ch = us.charAt(0);
            for (int i = 0; i <= s.length(); i++) {
                // Generate new string by inserting the character 'ch' at different positions in 's'
                String newStr = s.substring(0, i) + ch + s.substring(i);
                list.addAll(allPermutations(newStr, us.substring(1))); // addallthe permutations recieved
            }
        }
        return list; // outside else
    }
}

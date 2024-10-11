package Recursion;

import java.util.Scanner;

public class pnccounts {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the String: ");
            String us = scan.next();
            String s = "";  // Initially empty string
            int ans = countPermutations(s,us);
            System.out.println(ans);
            }

            static int countPermutations(String s, String us) {
                if (us.isEmpty()) {
                    return 1;  // Base case: found one permutation
                }
                else
                {
                    int result = 0;  // Accumulate the count of permutations
                    char ch = us.charAt(0);
                    for (int i = 0; i <= s.length(); i++)
                    {
                        String newString = s.substring(0, i) + ch + s.substring(i);
                        result += countPermutations(newString, us.substring(1));
                    }
                    return result;
                }
            }

}

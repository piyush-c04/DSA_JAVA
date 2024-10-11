package Recursion;

import java.util.Scanner;

public class ignoreAppifappleisthere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");//put strings with app and with apple
        String s = scan.next();
        System.out.println("Enter the word :");//put apple here
        String l = scan.next();
        String su = "";
        String ans = ignoreword(s, su, l);
        System.out.println(ans);
    }

    static String ignoreword(String s, String su, String l) {
        if (s.isEmpty()) {
            return su;
        }
        if (s.startsWith(l) && s.startsWith("apple")) {
            return ignoreword(s.substring(l.length()), su, l);
        } else {
            return ignoreword(s.substring(1), su + s.charAt(0), l);
        }
    }
}

package Recursion;
import java.util.*;
import java.sql.SQLOutput;

public class ignoreApple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the word :");
        String l = scan.next();
        String su = "";
        String ans = ignoreword(s, su, l);
        System.out.println(ans);
    }

    static String ignoreword(String s, String su, String l) {
        if (s.isEmpty()) {
            return su;
        }
        if (s.startsWith(l)) {
            return ignoreword(s.substring(l.length()), su, l);
        } else {
            return ignoreword(s.substring(1), su + s.charAt(0), l);
        }
    }
}

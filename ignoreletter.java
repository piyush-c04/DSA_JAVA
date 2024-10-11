package Recursion;

import java.util.*;
public class ignoreletter {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println("Enter the letter you dont want: ");
        String l = scan.next();
        String su = "";
        su = removeletter(su,s,l);
        System.out.println(su);
    }
    static String removeletter(String su,String s,String l){
        if (s.isEmpty())
        {
            return su;
        }
        if(s.startsWith(l))
        {
           return removeletter(su,s.substring(1),l);
        }
        else {
            return removeletter(su+s.charAt(0),s.substring(1),l);
        }
    }
}

package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n == 1 || n==0){
            return 1;
        }
        else
        {
            int result = n;
            result = result * fact(n-1);
            return result;
        }
    }
}

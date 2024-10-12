package Recursion;

public class printfibonacci {
    public static void main(String[] args) {
        int n =4;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
    }
} //if you wanna print all the number in fibonacci series
  // just put a for loop for n from 0 to whatever value and print fibo(n) in the main

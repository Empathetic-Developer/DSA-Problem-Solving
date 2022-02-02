//Problem Description
//
//        Given 2 non negative integers A and B, find gcd(A, B)
//        GCD of 2 integers A and B is defined as the greatest integer g such that g is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.
//        Note: DO NOT USE LIBRARY FUNCTIONS.
//
//        Problem Constraints
//        0 <= A, B <= 109
//
//        Input Format
//        First argument is an integer A.
//        Second argument is an integer B.

public class GcdOfTwoNumbers {

    //This function finds GCD using Euclid's Algorithm
    public static int gcdeuclid(int A, int B){
        if(A == 0){
            return B;
        }
        return gcdeuclid(B%A, A);
    }

    //This function finds GCD using loop (gives time limit exceeded error for large inputs)
    public static int gcd(int A, int B) {
        int limit = Math.min(A, B);
        int gcd = 0;

        if(A == 0){
            gcd = B;
            return gcd;
        }
        if(B == 0){
            gcd = A;
            return gcd;
        }
         for(int i=1; i<=limit; i++){
             if( A % i == 0 && B % i == 0){
                 gcd = i;
             }
         }
        return gcd;
    }

    //Main function
    public static void main(String[] args) {
        System.out.println(gcdeuclid(4, 6));
    }
}

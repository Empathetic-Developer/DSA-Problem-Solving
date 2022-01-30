public class GcdOfTwoNumbers {
    public static int gcdeuclid(int A, int B){
        if(A == 0){
            return B;
        }
        return gcdeuclid(B%A, A);
    }
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
                 gcd = i; //Math.max(gcd, i);
             }
         }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcdeuclid(4, 6));
    }
}

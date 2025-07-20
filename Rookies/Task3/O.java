package Task3;
import java.util.Scanner;

public class O {
     public static boolean isPrime(int x){
        if(x < 2)
        return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0)
            return false;
        }
        return true;
     }
     public static boolean isPalindrome(int x){
        String num = String.valueOf(x);
            for (int i = 0; i <num.length()/2 ; i++) {
                if(num.charAt(i) != num.charAt(num.length()-1-i))
                return false;
            }
            return true;
     }
    public static void fiveInOne(int[] A,int N){
             int max = A[0] ,min =A[0] ;
             int max_div = 0;
             int prime =0 , pal = 0 ,num_max_div = 0; 
        for (int elem : A) {
            if(max < elem)
            max = elem;
            if(min > elem)
            min = elem;
        }
        for (int i = 0; i < N; i++) {
            if(isPrime(A[i]))
            prime++;
            if(isPalindrome(A[i]))
            pal++;
        }
        int[] div = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= Math.sqrt(A[i]); j++) {
                if(A[i] % j ==0){
                    if(j == A[i]/j)
                div[i]++;
                else
                div[i] +=2;
            }
        }
        }
        for (int i = 0; i <N ; i++) {
            if(div[i] > max_div){
            max_div = div[i];
            num_max_div = A[i];
            }
            else if(div[i] == max_div)
            num_max_div = Math.max(num_max_div, A[i]);
        }
         System.out.println("The maximum number : " + max);
        System.out.println("The minimum number : " + min);
        System.out.println("The number of prime numbers : " + prime);
        System.out.println("The number of palindrome numbers : " + pal);
        System.out.println("The number that has the maximum number of divisors : "+num_max_div );
    }
         public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        fiveInOne(A, N);
    }
}

package Rookies.Task1;

import java.util.Scanner;

public class A{
    static void summation (int n ,long A[]){
        int sum = 0;
        for(int i=0 ; i < n ;i++){
         sum += A[i];
        }
        System.out.print(Math.abs(sum));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long A[] = new long[N];
         for(int i=0 ; i < N ;i++){
         A[i] = in.nextLong();
        }
        summation(N, A);
          in.close();
    }
}

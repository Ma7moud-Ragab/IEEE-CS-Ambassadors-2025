package Rookies.Task1;

import java.util.Scanner;

public class F {
    public static void Reversing(int N , long A[]){
        long[] B = new long[N];
        int k = N-1;
        for(int i=0 ; i< N ;i++){
            B[i] = A[k--];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(B[i]+" ");
            
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = in.nextLong();
        }
        Reversing (N ,A);
    }
}

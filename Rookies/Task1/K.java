package Rookies.Task1;

import java.util.Scanner;

public class K {
    public static void SumDigits(int N , long A[]){
        long sum =0;
        for (int i = 0; i < N; i++) {
            sum +=A[i];
        }
        System.out.println(sum);
      } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        String B = in.next();
        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = B.charAt(i) - '0';
        }
        SumDigits (N ,A);
    }
}

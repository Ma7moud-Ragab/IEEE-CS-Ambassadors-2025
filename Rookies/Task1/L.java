package Rookies.Task1;

import java.util.Scanner;

public class L {
     public static void MaxSubarray(int N , long A[]){
        for (int i = 0; i < N; i++) {
            long max = A[i];
            for (int j = i; j < N; j++) {
                if (max < A[j])
                max = A[j];
                System.out.print(max+" ");
            }
            
        }
        System.out.println();
      
      } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0){
        int N =in.nextInt();
        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = in.nextLong();
        }
        MaxSubarray (N ,A);
    }
}
    
}

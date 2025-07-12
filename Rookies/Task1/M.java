package Rookies.Task1;

import java.util.Scanner;

public class M {
    public static void ReplaceMinMax(int N , long A[]){
        long min = A[0];
        long max = A[0];
        int k =0 , l = 0;
           for (int i = 0; i < N; i++) {   
            if(A[i] < min){
            min = A[i];
            k= i;
            }
            if(A[i] > max){
            max = A[i];
            l =i;
            }
        }
        A[l] = min;
        A[k] = max;
        for (int i = 0; i < N; i++) {
            System.out.print(A[i]+" ");
            
        }
      } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int N =in.nextInt();
        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = in.nextLong();
        }
        ReplaceMinMax (N ,A);
    }
}

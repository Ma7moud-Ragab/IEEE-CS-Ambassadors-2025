package Rookies.Task1;

import java.util.Scanner;

public class H {
    public static void Sorting(int N , long A[]){
        long min ,temp ;
        for(int i=0 ; i< N;i++){
            min = A[i];
            for (int j = i; j < N; j++) {
              if(A[j] < min){
                 min = A[j];
                 temp = A[j];
                 A[j] = A[i];
                 A[i] = min;
              }  
            }
        }
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
        Sorting (N ,A);
    }
    
}

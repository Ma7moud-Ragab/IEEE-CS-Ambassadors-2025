package Rookies.Task1;

import java.util.Scanner;

public class J {
     public static void LuckyArray(int N , long A[]){
      Long min = A[0];
      int f=0;
      for (int i = 1; i < N; i++) {
          if(A[i] < min)
          min = A[i];
      }
      for (int i = 0; i < N; i++) {
          if(A[i] == min)
          f++;
      }
      if(f % 2 == 0)
      System.out.println("Unlucky");
      else
      System.out.println("Lucky");
      } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();

        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = in.nextLong();
        }
        LuckyArray (N ,A);
    }
 
}

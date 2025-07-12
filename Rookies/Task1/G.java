package Rookies.Task1;

import java.util.Scanner;

public class G {
      public static void PalindromeArray(int N , long A[]){
        boolean b = true;
        for(int i=0 ; i< N/2;i++){
          if(!(A[i] == A[N-(i+1)])){
                b = false;
          }
        }
        if(b)
        System.out.println("YES");
        else
        System.out.println("NO");
      }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = in.nextLong();
        }
        PalindromeArray (N ,A);
    }
}

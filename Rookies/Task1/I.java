package Rookies.Task1;

import java.util.Scanner;

public class I {
    public static void SmallestPair(int N , long A[]){
       long min = Long.MAX_VALUE;
       long m;
        for(int i=0 ; i< N;i++){
             for (int j = i+1; j < N; j++) {
                if(i < j){
                    m =(A[i] + A[j] + j -i);
                    if(m < min)
                        min = m;
                }  
             }
        }
        System.out.println(min);
      }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T =in.nextInt();
        while(T-- > 0){
        int N =in.nextInt();

        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = in.nextLong();
        }
        SmallestPair (N ,A);
    }
 }
}

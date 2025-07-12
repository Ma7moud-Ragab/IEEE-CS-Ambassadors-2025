package Rookies.Task1;

import java.util.Scanner;

public class E {
    public static void lowestNumber(int N , long A[]){
         long x = A[0];
         int k =1;
        for(int i=1 ; i< N ;i++){
            if(x > A[i]){
            x = A[i];
            k = i+1;
        }
    }
    System.out.println(x+" "+k);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = in.nextLong();
        }
        lowestNumber(N ,A);
    }
    
}

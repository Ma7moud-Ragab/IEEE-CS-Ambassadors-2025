package Rookies.Task1;

import java.util.Scanner;

public class D {
    public static void position(int N , long A[]){
        for(int i=0 ; i< N ;i++){
            if(A[i] <= 10)
            System.out.println("A["+i+"] = "+A[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in.nextInt();
        long A[] =new long[N];
        for(int i=0 ; i<N ;i++){
            A[i] = in.nextLong();
        }
        position(N ,A);
    }
    
}

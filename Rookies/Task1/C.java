package Rookies.Task1;

import java.util.Scanner;

public class C {
    public static void replace(int N , long A[]){
     
        for(int i=0 ; i<N ;i++){
             if(A[i] > 0)
               A[i] = 1;
            else if(A[i] < 0)
                A[i] = 2;
        }
        for(int i=0 ; i<N ;i++){
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
        replace(N, A);
    }
}

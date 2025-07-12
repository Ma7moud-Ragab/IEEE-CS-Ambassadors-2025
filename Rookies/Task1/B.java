package Rookies.Task1;

import java.util.Scanner;

public class B {
    public static void searching(int N ,long A[] ,long X){
         boolean b = false;
        for (int i =0;  i <N ; i++){
                if(X == A[i]){
                    System.out.println(i);
                    b = true;
                    break;
                }
        }
        if(!b)
         System.out.println(-1);   
        }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int N = in.nextInt();
         long A[] = new long[N];
        for (int i =0;  i < N ; i++){ 
                A[i] = in.nextLong();
        }   
        long X = in.nextLong();
        searching(N, A, X); 
    }
}

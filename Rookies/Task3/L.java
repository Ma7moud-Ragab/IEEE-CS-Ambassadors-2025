package Task3;

import java.util.Scanner;

public class L {
    public static void newArray(int[] A,int[] B, int N){
       int[] res = new int[2*N];
       int i =0;
       for (int elem : B) {
           res[i++] = elem;
       } 
       for (int elem : A) {
           res[i++] = elem;
       }
       for (int j = 0; j < (2*N)-1; j++) {
           System.out.print(res[j]+" ");
       }
        System.out.println(res[res.length-1]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = in.nextInt();
        }
        newArray(A,B,N);

    }
    
}

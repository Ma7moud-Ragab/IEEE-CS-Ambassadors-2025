package Task3;

import java.util.Scanner;

public class N {
     public static void shiftZeros(int[] A, int N){
        int[] res = new int[N];
        int zeros = 0 ,i = 0;
        for (int elem : A) {
            if(elem == 0)
            zeros ++;
            else
            res[i++] = elem;
        }
        while(zeros-- > 0){
            res[i++] = 0;
        }
        for (int j = 0; j < N-1; j++) {
            System.out.print(res[j]+" ");
        }
        System.out.print(res[N-1]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        shiftZeros(A,N);

    }
}

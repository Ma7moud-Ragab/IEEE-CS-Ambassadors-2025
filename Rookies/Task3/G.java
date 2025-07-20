package Task3;

import java.util.Scanner;

public class G {
    public static void maxAndMin(int[] A, int N){
        int max = A[0] ,min =A[0];
        for (int elem : A) {
            if(max < elem)
            max = elem;
            if(min > elem)
            min = elem;
        }
        System.out.println(min+" "+max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        maxAndMin(A,N);

    }
}

package Task3;

import java.util.Scanner;

public class J {
    
    public static void Average(double[] A, int N){
        double sum = 0;
        for (double elem : A) {
            sum += elem;
        }
        System.out.printf("%.6f\n",(double)sum/N);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextDouble();
        }
        Average(A,N);

    }
}

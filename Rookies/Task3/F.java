package Task3;

import java.util.Scanner;

public class F {
    public static void Function(int x,int N){
        long sum = 0;
        for (int i = 2; i <= N; i+=2) {
            sum += Math.pow(x, i);
        }
        System.out.println(sum);
    

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
         int N = in.nextInt();
        Function(x,N);
    }
    
}

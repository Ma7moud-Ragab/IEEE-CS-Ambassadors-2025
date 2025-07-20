package Task3;

import java.util.Scanner;

public class D {
    public static void PrimeFunction(int N){
        if(N < 2){
            System.out.println("NO");
             return;
        }
        if(N == 2){
            System.out.println("YES");
            return;
        }
        if(N % 2 ==0){
            System.out.println("NO");
            return;
        }
        int sqrt = (int)Math.sqrt(N);
        for (int i = 3; i <= sqrt; i+=2) {
            if(N % i == 0){
                System.out.println("NO");
                return;
            }
        } 
     System.out.println("YES");
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        while(T > 0){
            T--;
         int N = in.nextInt();

        PrimeFunction(N);
        }

    }
    
}

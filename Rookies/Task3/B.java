package Task3;
import java.util.Scanner;

public class B {
    public static void print(int N){
        for (int i = 1; i <= N ; i++) {
            if(i != N)
        System.out.print(i+" ");
        else
        System.out.println(i);
    }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        print(N);

    }
    
}
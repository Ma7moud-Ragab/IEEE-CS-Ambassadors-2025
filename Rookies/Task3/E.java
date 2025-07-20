package Task3;

import java.util.Scanner;

public class E {
    public static void Swap(int x ,int y){
        int temp = x;
        x = y;
        y= temp;
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
         int y = in.nextInt();

        Swap(x,y);

    }
    
}

package Task3;

import java.util.Scanner;

public class A {
    public static void add(int x , int y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        add(x,y);

    }
    
}

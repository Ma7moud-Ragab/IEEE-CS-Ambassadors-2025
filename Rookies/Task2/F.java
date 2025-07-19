package Task2;

import java.util.Scanner;

public class F {
    public static void WayTooLongWords(String s){
        if(s.length() > 10)
            System.out.println((s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1)));
            else
            System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            t--;
        String s = in.next();
        WayTooLongWords(s);
    }
}
}

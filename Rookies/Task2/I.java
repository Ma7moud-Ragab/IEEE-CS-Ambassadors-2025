package Task2;

import java.util.Scanner;

public class I {
    public static void Palindrome(String s){
        boolean pal = true;
        for (int i = 0; i < s.length()/2; i++) {
            if(!(s.charAt(i) == s.charAt(s.length()-1-i)))
            pal = false;
        }
        if(pal)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Palindrome(s);
    }
}

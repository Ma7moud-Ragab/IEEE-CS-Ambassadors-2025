package Task2;

import java.util.Scanner;

public class Q {
    public static void ReverseWords(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reverse = new StringBuilder(word).reverse();
            result = result.append(reverse).append(" ");
        }
       System.out.println(result.toString().trim());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ReverseWords(s);
    }
}

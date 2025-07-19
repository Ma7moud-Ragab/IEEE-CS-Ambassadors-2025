package Task2;

import java.util.Scanner;

public class G {
     public static void Conversion(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
            if(Character.isUpperCase(s.charAt(i)))
            result.append(Character.toLowerCase(s.charAt(i)));
            else
            result.append(Character.toUpperCase(s.charAt(i)));
            }
            else
            result.append(' ');
        }
        System.out.println(result.toString() );
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Conversion(s);
    }
}

package Task2;

import java.util.Scanner;

public class M {
    public static void SubsequenceString(String s){
        String h = "hello";
        int k =0;
        for (int i = 0; i < s.length(); i++) {
            if(k == 5)
            break;
            else if(s.charAt(i) == h.charAt(k))
                    k++;
            }
                if(k == 5)
             System.out.println("YES");
             else 
             System.out.println("NO");

        
   
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        SubsequenceString(s);
    }
}

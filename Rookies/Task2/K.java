package Task2;

import java.util.Scanner;

public class K {
     public static void ILovestrings(String s){
        String[] res = s.trim().split("\\s+");
        for (int i = 0;; i++) {
            if(i < res[0].length() && i < res[1].length())
           System.out.print(res[0].charAt(i)+""+res[1].charAt(i));
           else if (i >= res[0].length() && i < res[1].length())
           System.out.print(res[1].charAt(i));
           else if (i >= res[1].length() && i < res[0].length())
           System.out.print(res[0].charAt(i));
           else 
           break;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t > 0){
            t--;
        String s = in.nextLine();
        ILovestrings(s);
        }
    }
    
}

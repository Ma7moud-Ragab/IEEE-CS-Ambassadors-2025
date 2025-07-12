package Rookies.Task1;

import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A =in.nextInt();
        int B =in.nextInt();
        String S = in.next();
        
        if( S.length() != A+B+1){
        System.out.println("No");
        return;
        }
        else if (S.charAt(A) != '-'){
         System.out.println("No");
            return;
        }
            for (int i = 0; i < S.length(); i++){
            if (i == A) continue; 
            if (!Character.isDigit(S.charAt(i))) {
                System.out.println("No"); 
                return;  
            }

        }
              System.out.println("Yes");
    }

}



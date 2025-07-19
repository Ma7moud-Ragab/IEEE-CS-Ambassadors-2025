package Task2;

import java.util.Scanner;


public class P {
    public static void CountWords(String s) {
        int count = 0;
        if(s.isEmpty())
        System.out.println(0);
        else{
        int k=0;
            
     for (int i = 0; i < s.length(); i++) {
        if((Character.isLetter(s.charAt(i))) ){
            k++;
          }                                      //cdc frf plp
          else{                                  // k > 3   count > 0
            if(!(k ==0)){
            count ++;
            k =0;
            }
          }
        }
        if(Character.isLetter(s.charAt(s.length()-1)))
        count++;
        System.out.println(count);
     }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        CountWords(s);
     
    }
}

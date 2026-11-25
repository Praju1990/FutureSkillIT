package Practice;

import java.util.Locale;

public class CountVowels {
    public static void main(String[] args) {
        String text = "Hello Java";
        int count = 0;
       for (char ch:text.toLowerCase().toCharArray()){
           if("aeiou".indexOf(ch)>=0) {
               count++;
               

           }


        }
            System.out.println("Number of vowels:" + count);


        }
    }




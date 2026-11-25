package Daywise_class_notes;

import java.util.Scanner;

public class Exp_hand {

    static void cal() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("pls enter the value a ");
            int a = sc.nextInt();

            System.out.println("pls enter the value b");
            int b = sc.nextInt();

            System.out.println("a + b =" + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a / b =" + (a / b));
            System.out.println("a % b = " + (a % b));
            System.out.println("a * b = " + (a - b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cal();
        } finally {
            System.out.println("done");

        }
    }

        static void main (String[]args){
            cal();


        }


}



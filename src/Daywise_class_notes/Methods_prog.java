package Daywise_class_notes;

public class Methods_prog {

    static int fact_num(int num) {
        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact *= i;
        }
        return fact;


    }
}

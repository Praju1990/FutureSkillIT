package Daywise_class_notes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Collections_pro {

    static  void main(String[]args){

//        ArrayList a1 = new ArrayList();
//        a1.add(45);
//        a1.add(36);
//        a1.add(25);
        ArrayList<Integer>a1 =new ArrayList();

        List<Integer>num =Arrays.asList(10,23,1, 10, 2, 10, 12, 10);
//        Stream<Integer> ns = num.stream();
//        Stream<Integer> even_num = ns.filter(  n-> n  ==0);
//        Stream<Integer>final_output = even_num.distinct();
//        final_output.forEach(System.out::Println);

        num.stream()
                .filter( n->n % 2 ==0)
                .distinct()
                .forEach(System.out::   println);




    }

}

package Practice;
class Calculator{
    static int add(int a , int b ){
        return a+b;
    }
    int multiply(int a , int b){
        return a*b;
    }
}

public class MethodTypeDemo {
    public static void main(String[] args){
        System.out.println(Calculator.add(3, 4));
       Calculator calc = new Calculator();
       System.out.println(calc.multiply(2, 4));

    }
}

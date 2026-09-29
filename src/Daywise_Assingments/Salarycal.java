package Daywise_Assingments;

public class Salarycal {

    public static void main(String[] args) {
        double  basic  = 50000;
        double bonus = 5000;
        double taxRate = 10;

        double gross  = basic + bonus;
        double tax = gross*taxRate/100;
        double net = gross  -tax;

        System.out.println("Basic salary:  "   + basic);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net salary:   "   +net);


    }
}

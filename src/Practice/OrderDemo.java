package Practice;

public class OrderDemo {
    static {
        System.out.println("1. Static block");

    }
    {
        System.out.println("2 .Instant block");

    }

    OrderDemo() {
        System.out.println("3. Constructor");
    }

    public static void main(String[]args){
        System.out.println("4 Main Starts");
        new OrderDemo();
        new OrderDemo();
    }
}

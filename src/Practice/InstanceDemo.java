package Practice;

class Counter {

    int count = 0;

    void increment() {
        count++;

    }
}
    public class InstanceDemo {
        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            c1.increment();
            c1.increment();
            c2.increment();
            System.out.println(c1.count);
            System.out.println(c2.count);
        }
    }




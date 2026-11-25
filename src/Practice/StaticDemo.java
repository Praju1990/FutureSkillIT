package Practice;

class Student {
    static String institute = "Java Academy";
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + institute);
    }
}
    public class StaticDemo {
        public static void main(String[] args) {
            Student s1 = new Student("Asha");
            Student s2 = new Student("Ravi");
            s1.display();
            s2.display();
            Student.institute = "Code Academy";
            s1.display();
            s2.display();
        }
    }



package Practice;

 class Students {

  static String institute  = "Java Academy";
  String name;

  Students(String name) {
   this.name = name;
  }

  void display() {

   System.out.println(name + "-" + institute );

  }
 }

  public class StaticDemo1{

   public static void main(String[]args){

    Student s1 = new Student("Asha");
    Student s2 = new Student("Ravi");
    s1.display();
    s2.display();
    Student.institute = "Code Academy";

    s1.display();
    s2.display();
   }
  }




package Practice;

public class LargestNumber {
    public static void main(String[]args){
        int a =12 ; int b = 27; int c = 19;
        int largest;
        if (a >=b && a>=c ) {
            largest = a;
        }
        else if (b>=c && b >=a){
            largest = b;

        }
        else {
            largest = c;

        }

System.out.println(largest);





    }
}

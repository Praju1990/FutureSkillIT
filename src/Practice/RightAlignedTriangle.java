package Practice;

public class RightAlignedTriangle {
    public static void main(String[] args){
        int rows = 4;
        for(int i = 1; i<= rows; i++){
            for (int s = 1; s<=rows -1;i++)
                System.out.print("");
                for (int j =1; j<= i; i++);
                System.out.print("*");
                System.out.println();
            }
        }
    }


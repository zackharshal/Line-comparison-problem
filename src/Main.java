import java.util.Scanner;
public class Main {
    public static double lineLength(int x1,int y1, int x2, int y2){
        double lengthOfLine = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 -y1), 2));
        return lengthOfLine;
    }
    public static void compareTo(double lengthOfLine1, double lengthOfLine2){
        if(lengthOfLine1 == lengthOfLine2){
            System.out.println("Line 1 and line 2 are equal");
        }else{
            System.out.println("Line 1 and line 2 are not equal");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation problem");
        Scanner scanner = new Scanner(System.in);
        double[] lengthOfLine = new double[2];
        for (int i = 1; i <=2 ;i++){
            System.out.println("Enter the coordinates for line " + i +": ");
            System.out.println("Enter the coordinates of 1st point");
            System.out.print("Enter the x coordinate: ");
            int x1 = scanner.nextInt();
            System.out.print("Enter the y coordinate: ");
            int y1 = scanner.nextInt();
            System.out.println("Enter the coordinates of 2nd point");
            System.out.print("Enter the x coordinate: ");
            int x2 = scanner.nextInt();
            System.out.print("Enter the y coordinate: ");
            int y2 = scanner.nextInt();
            lengthOfLine[i-1] = lineLength(x1,y1,x2,y2);
        }
        compareTo(lengthOfLine[0], lengthOfLine[1]);
        
        scanner.close();
    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation problem");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates for 1st line:");
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
        float lengthOfLine1 = (float) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 -y1), 2));

        System.out.println("Enter the coordinates for 2nd line:");
        System.out.println("Enter the coordinates of 1st point");
        System.out.print("Enter the x coordinate: ");
        int x3 = scanner.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y3 = scanner.nextInt();
        System.out.println("Enter the coordinates of 2nd point");
        System.out.print("Enter the x coordinate: ");
        int x4 = scanner.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y4 = scanner.nextInt();
        float lengthOfLine2 = (float) Math.sqrt(Math.pow((x4-x3), 2) + Math.pow((y4 -y3), 2));


        if(lengthOfLine1 == lengthOfLine2){
            System.out.println("Length of line 1 and line 2 are equal.");
        }else{
            System.out.println("Length of line 1 and line 2 are not equal.");
        }
        
        scanner.close();
    }
}
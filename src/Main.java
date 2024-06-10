// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation problem");
        Scanner scanner = new Scanner(System.in);
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
        float lengthOfLine = (float) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 -y1), 2));
        System.out.printf("Length of the line is %.2f" , lengthOfLine);

        
        scanner.close();
    }
}
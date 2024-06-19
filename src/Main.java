import java.util.Scanner;
public class Main {
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;
    private float lengthOfLine;
    public float getLengthOfLine() {
        return lengthOfLine;
    }
    public Main(int x1,int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public void lineLength(){
        lengthOfLine =(float) (Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 -y1), 2)));
        System.out.printf("The length of this line is %.2f\n",lengthOfLine);
    }
    public static void compareTo(float lengthOfLine1, float lengthOfLine2){
        if(lengthOfLine1 == lengthOfLine2){
            System.out.println("Line 1 and line 2 are equal");
        }else{
            System.out.println("Line 1 and line 2 are not equal");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation problem");
        Scanner scanner = new Scanner(System.in);
        Main[] line = new Main[2];
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
            line[i-1] = new Main(x1, y1, x2, y2);
            line[i-1].lineLength();
        }
        compareTo(line[0].getLengthOfLine(), line[1].getLengthOfLine());
        
        scanner.close();
    }
}
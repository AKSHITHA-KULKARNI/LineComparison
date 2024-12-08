import java.util.Scanner;

class Line {
    private double x1, y1, x2, y2;

    // Constructor to initialize coordinates
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate the length of the line
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to check if two lines are equal
    public boolean isEqual(Line otherLine) {
        return Double.compare(this.calculateLength(), otherLine.calculateLength()) == 0;
    }
}

public class LineEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Line 1
        System.out.println("Enter coordinates for Line 1 (x1, y1, x2, y2): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Line line1 = new Line(x1, y1, x2, y2);

        // Input for Line 2
        System.out.println("Enter coordinates for Line 2 (x1, y1, x2, y2): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        Line line2 = new Line(x3, y3, x4, y4);

        // Check if lines are equal
        if (line1.isEqual(line2)) {
            System.out.println("Line 1 and Line 2 are equal in length.");
        } else {
            System.out.println("Line 1 and Line 2 are not equal in length.");
        }

        scanner.close();
    }
}

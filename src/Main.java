import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner scanner = new Scanner(System.in);

        // Input for Line 1
        System.out.println("Enter coordinates for Line 1 (x1, y1, x2, y2): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Line line1 = new Line(x1, y1, x2, y2);
        double length1 = line1.calculateLength();
        System.out.printf("The length of Line 1 is: %.2f%n", length1);

        // Input for Line 2
        System.out.println("Enter coordinates for Line 2 (x1, y1, x2, y2): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        Line line2 = new Line(x3, y3, x4, y4);
        double length2 = line2.calculateLength();
        System.out.printf("The length of Line 2 is: %.2f%n", length2);

        // Check if the two lines are equal in length
        if (line1.isEqual(line2)) {
            System.out.println("Line 1 and Line 2 are equal in length.");
        } else {
            System.out.println("Line 1 and Line 2 are not equal in length.");
        }

        // Compare the two lines
        int comparisonResult = line1.compareTo(line2);
        if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else {
            System.out.println("Line 1 and Line 2 are equal in length.");
        }

        // UC4: Using equals and compareTo
        System.out.println("=== UC4: Additional Comparison Using equals and compareTo ===");
        LineMethods.compareLines(line1, line2); // Updated class name used here

        scanner.close();
    }
}

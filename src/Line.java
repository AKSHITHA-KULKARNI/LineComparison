public class Line {
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

    // Method to compare the lengths of two lines
    public int compareTo(Line otherLine) {
        return Double.compare(this.calculateLength(), otherLine.calculateLength());
    }
}

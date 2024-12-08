public class LineMethods {
    // Method to compare two lines for equality and length
    public static void compareLines(Line line1, Line line2) {
        // Using equals to check if lengths are equal
        if (line1.equals(line2)) {
            System.out.println("UC4: Line 1 and Line 2 are equal in length using equals().");
        } else {
            System.out.println("UC4: Line 1 and Line 2 are not equal in length using equals().");
        }

        // Using compareTo to compare lengths
        int result = line1.compareTo(line2);
        if (result > 0) {
            System.out.println("UC4: Line 1 is longer than Line 2 using compareTo().");
        } else if (result < 0) {
            System.out.println("UC4: Line 1 is shorter than Line 2 using compareTo().");
        } else {
            System.out.println("UC4: Line 1 and Line 2 are equal in length using compareTo().");
        }
    }
}

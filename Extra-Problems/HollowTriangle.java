package hollowtriangle;

public class HollowTriangle {

    // Question --> make a triangle using stars (*) without filling the inside, leaving it hollow?
    public static void main(String[] args) {

        // Define the number of rows for the triangle
        int rows = 8;

        // Outer loop to iterate through each row
        for (int i = 1; i <= rows; i++) {

            // Inner loop to print leading spaces for each row
            for (int j = i; j <= rows; j++) {
                System.out.print("  "); // Print spaces to align the triangle
            }

            // Inner loop to print the left side of the triangle
            for (int j = 1; j < i; j++) {
                // Print '*' at the start of the row
                if (j == 1) {
                    System.out.print("* ");
                } else {
                    // Print spaces to keep the inside of the triangle hollow
                    System.out.print("  ");
                }
            }

            // Inner loop to print the right side of the triangle
            for (int j = 1; j <= i; j++) {
                // Print '*' at the end of the row
                if (j == i) {
                    System.out.print("* ");
                } else {
                    // Print spaces to keep the inside hollow
                    System.out.print("  ");
                }
            }

            // Move to the next line after printing each row
            System.out.println();
        }

    }

}

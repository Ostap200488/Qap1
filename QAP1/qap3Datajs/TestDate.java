// TestDate.java
public class TestDate {
    public static void main(String[] args) {
        try {
            // Create a Date object
            Date date = new Date(23, 9, 2024);
           
            // Print the date using toString()
            System.out.println("Date: " + date.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
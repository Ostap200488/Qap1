// TestTime.java
public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display initial times
        System.out.println("Initial Times:");
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);

        // Call nextSecond for t1
        t1.nextSecond();

        // Call previousSecond for t2
        t2.previousSecond();

        // Display final times
        System.out.println("\nFinal Times After Adjustments:");
        System.out.println("Time 1 after next second: " + t1);
        System.out.println("Time 2 after previous second: " + t2);
    }
}
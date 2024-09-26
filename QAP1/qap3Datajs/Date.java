 // Date.java
 public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor to initialize the date
    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date provided.");
        }
    }

    // Validate date
    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1 || year < 1) {
            return false;
        }
        int[] daysInMonth = {31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return day <= daysInMonth[month - 1];
    }

    // Check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to return the date as a string
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
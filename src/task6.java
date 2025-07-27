public class taks6 {
    public static void main(String[] args) {
        int year = 2;
        int days = 365;

        // Това изчесление е вярно, само ако годината не е високотна, иначе дните на са 365

        int convertYearsToDays = year * days;

        System.out.println("The conversion of the year " + year + " of days " + days + " is " + convertYearsToDays + " days.");


    }
}

import java.util.Scanner;

public class tesk5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first integer number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter a first double number: ");
        double second = scanner.nextDouble();

        double sumOfNums = firstNum + second;
        System.out.println("The sum of the numbers is " + sumOfNums);


        System.out.println("------");

        System.out.println("Enter a second double number: ");
        double secDoubleNum = scanner.nextDouble();

        System.out.println("Enter a third double number: ");
        double thirdDoubleNum = scanner.nextDouble();

        double multiplicationOfNums = firstNum + second;
        System.out.println("The sum of the numbers is " + sumOfNums);

    }
}

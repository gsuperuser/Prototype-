import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate, time;

        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter the rate of interest (%): ");
        rate = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        time = sc.nextDouble();

        int fullYears = (int) time;
        double openingBalance = principal;
        double totalInterest = 0;

        System.out.println("\nYear | Opening Balance | Interest | Closing Balance | Total Interest");
        System.out.println("-------------------------------------------------------------------");

        for (int year = 1; year <= fullYears; year++) {
            double interest = principal * rate / 100;
            double closingBalance = openingBalance + interest;
            totalInterest += interest;

            System.out.printf("%4d | %16.2f | %8.2f | %15.2f | %14.2f%n",
                    year, openingBalance, interest, closingBalance, totalInterest);

            openingBalance = closingBalance;
        }

        if (time > fullYears) {
            double remainingTime = time - fullYears;
            double interest = principal * rate / 100 * remainingTime;
            double closingBalance = openingBalance + interest;
            totalInterest += interest;

            System.out.printf("%4.2f | %16.2f | %8.2f | %15.2f | %14.2f%n",remainingTime, openingBalance, interest, closingBalance, totalInterest);
            openingBalance = closingBalance;
        }

        System.out.println("\nFinal maturity information");
        System.out.printf("Final year: %.2f years%n", time);
        System.out.printf("Principal amount: %.2f%n", principal);
        System.out.printf("Total interest: %.2f%n", totalInterest);
        System.out.printf("Maturity amount: %.2f%n", openingBalance);

        sc.close();
    }
}
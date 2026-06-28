import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Current Value: ");

        double current =
                sc.nextDouble();

        System.out.print(
                "Enter Growth Rate (%): ");

        double rate =
                sc.nextDouble();

        System.out.print(
                "Enter Number of Years: ");

        int years =
                sc.nextInt();

        double future =
                FinancialForecast
                        .futureValue(
                                current,
                                rate / 100,
                                years);

        System.out.println(
                "\nFuture Value = ₹"
                        + future);

        sc.close();
    }
}
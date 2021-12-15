import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("\n1.INR To USD");
            System.out.println("2.USD To INR");
            System.out.println("3.INR To AUD");
            System.out.println("4.AUD To INR");
            System.out.println("5.INR To CAD");
            System.out.println("6.CAD To INR");
            System.out.println("7.INR To EURO");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(" Enter amount in INR");
                    double amountInRupees = sc.nextDouble();
                    if (amountInRupees <= 0) {
                        throw new IllegalArgumentException("Amount cannot be negative");
                    } else
                        System.out.printf(" Amount in USD %.2f" ,currencyConverter.rupeesToDollar(amountInRupees));
                    break;
                case 2:
                    System.out.println("Enter Amount in USD");
                    double amountInUSD = sc.nextDouble();
                    if (amountInUSD <= 0) {
                        throw new IllegalArgumentException("Amount cannot be negative");
                    } else
                        System.out.printf(" Amount in INR %.2f" ,currencyConverter.dollarToRupees(amountInUSD));
                    break;
                case 3:
                    System.out.println("Enter amount in INR to convert it to AUD");
                    double amountInINR = sc.nextDouble();
                    if (amountInINR <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative");
                    else
                        System.out.printf(" Amount in AUD %.2f " , currencyConverter.rupeesToAustralianDollar(amountInINR));
                    break;
                case 4:
                    System.out.println("Enter amount in AUD");
                    double amountInAUD = sc.nextDouble();
                    if (amountInAUD <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative");
                    else
                        System.out.printf(" Amount in INR %.2f " ,currencyConverter.australianDollarToRupees(amountInAUD));
                    break;
                case 5:
                    System.out.println("Enter amount in INR to convert it to CAD");
                    amountInINR = sc.nextDouble();
                    if (amountInINR <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative");
                    else
                        System.out.printf(" Amount in CAD %.2f " , currencyConverter.rupeesToCanadianDollar(amountInINR));
                    break;
                case 6:
                    System.out.println("Enter amount in CAD");
                    double amountInCAD = sc.nextDouble();
                    if (amountInCAD <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative or zero");
                    else
                        System.out.printf(" Amount in INR %.2f " , currencyConverter.canadianDollarToRupees(amountInCAD));
                    break;
                case 7:
                    System.out.println("Enter amount in INR");
                    amountInINR = sc.nextDouble();
                    if (amountInINR <= 0)
                        throw new IllegalArgumentException("Amount cannot be negative or zero");
                    else
                        System.out.printf(" Amount in EURO %.2f " , currencyConverter.rupeesToEuropeanDollar(amountInINR));
                    break;
                default:
                    System.out.println("Enter correct choice");
                    break;
            }
        }
    }
}

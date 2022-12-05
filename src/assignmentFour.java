import java.util.Scanner;

public class assignmentFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int phonePrice = 1800;
        int numberOfInstallment, installmentPerMonth;
        System.out.print("Enter Number of Installment: ");
        numberOfInstallment = input.nextInt();
        installmentPerMonth = phonePrice / numberOfInstallment;
        System.out.print("Monthly Installment: " + installmentPerMonth + " euro");


    }
}

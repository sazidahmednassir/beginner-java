import java.util.Scanner;

public class Ifelseasss {
    public static void main(String[] args) {
        // create a program to find out valid voter
        Scanner input = new Scanner(System.in);
        int voterAge;
        System.out.print("Enter your age: ");
        voterAge = input.nextInt();
        if (voterAge >= 18) {
            System.out.println("Valid Voter");
        } else {
            System.out.println("Invalid Voter");
        }
    }
}

import java.util.Scanner;

public class oddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.print("This number is Even");
        } else {
            System.out.print("This number is Odd");
        }
    }
}
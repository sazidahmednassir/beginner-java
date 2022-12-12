import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A number = ");
        int num;
        num = input.nextInt();
        if (num > 0) {
            System.out.print("positive");
        } else if (num < 0) {
            System.out.print("negative");
        } else {
            System.out.print("zero");
        }
    }
};
import java.util.Scanner;

public class FarenheightConvert {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double Cels,Farn;

        System.out.print("Enter A Temparature in Celcius = ");
        Cels = input.nextDouble();

        Farn=1.8*Cels+32;

        System.out.println("Temparature in Fahrenhight = "+Farn);

    }
}

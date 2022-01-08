import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter two numbers -> ");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first: ");
        int first = in.nextInt();

        System.out.print("Enter the second: ");
        int second = in.nextInt();

        new NormalAlgorithm(first, second).searchGCD();
        new ExtendedAlgorithm(first, second).searchGCD();
    }
}

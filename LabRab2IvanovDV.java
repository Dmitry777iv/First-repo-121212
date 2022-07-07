import java.util.Scanner;
public class LabRab2IvanovDV {

    public static void main (String[] args) {
        System.out.println("Guess from 1 to 10");
        Scanner scan = new Scanner(System.in);
        int b = 9;
        do {
            int a = scan.nextInt();
            if (a == b) System.out.println("Correct");
            else System.out.println("Incorrect");
        } while (true);
    }
}

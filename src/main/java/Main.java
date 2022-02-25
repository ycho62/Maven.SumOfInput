import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Main Main_object = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int newN = scanner.nextInt();

        int result = Main_object.sumOfNumbers(newN);
        System.out.println(result);

    }

    int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }








    }




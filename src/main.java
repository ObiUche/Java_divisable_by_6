import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int amountOfNumbers = scanner.nextInt();
        int sumDiv6 = 0;

        for (int i = 1 ; i <= amountOfNumbers; i++){
            int input = scanner.nextInt();
            if (input % 6 == 0 ){
                sumDiv6 += input;
            }
        }
        System.out.print(sumDiv6);

    }
}
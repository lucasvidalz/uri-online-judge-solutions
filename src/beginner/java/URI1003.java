package beginner;

import java.util.Scanner;

public class URI1003 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int soma;

        a = input.nextInt();
        b = input.nextInt();

        soma = a + b;

        System.out.printf("SOMA = %d%n", soma);

        input.close();
    }
}

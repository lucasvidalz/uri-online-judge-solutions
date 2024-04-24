package beginner;

import java.util.Scanner;

public class URI1004 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int prod;

        primeiroNumero = input.nextInt();
        segundoNumero = input.nextInt();

        prod = primeiroNumero * segundoNumero;

        System.out.printf("PROD = %d%n", prod);

        input.close();
    }
}
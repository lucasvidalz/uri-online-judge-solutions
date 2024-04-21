package beginner;

import java.util.Scanner;

public class URI1001 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a;
		int b;
		int x;

		a = input.nextInt();
		b = input.nextInt();

		x = a + b;

		System.out.printf("X = %d%n", x);

		input.close();
		
	}
}
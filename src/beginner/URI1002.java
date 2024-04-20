package beginner;

public class URI1002 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double raio;
		double area;

		raio = input.nextDouble();
		area = Math.pow(raio, 2) * 3.14159;
		
		System.out.printf("A=%.4f%n", area);

		input.close();

	}

}

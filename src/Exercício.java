
public class Exercício {

	public static void main(String[] args) {

		System.out.println(String.format("%d %d %d\n", somar(5, 4), proximo(5), dobro(5)));

	}

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static int proximo(int num) {
		return somar (num, 1);
	}

	public static int dobro(int num) {
		return somar(num, num);
	}

}
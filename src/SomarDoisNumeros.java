import java.util.*;

class SomarDoisNumeros {

	public static int somaDeNumeros(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int input01 = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int input02 = scanner.nextInt();
		int result = somaDeNumeros(input01, input02);
		System.out.println("A soma foi de: " + result);
	}

	@Override
	public String toString() {
		return "SomarDoisNumeros []";
	}

}

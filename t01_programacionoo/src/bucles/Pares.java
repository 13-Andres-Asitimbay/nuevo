package bucles;
import java.util.Scanner;
public class Pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese un n�mero cualquiera: ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int i = 1;
		while(i <= n) {
			int R = i * 2;
			System.out.println("N�mero: " + R);
			i = i + 1;
		}
	}

}

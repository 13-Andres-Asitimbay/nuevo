package bucles;
import java.util.Scanner;
public class Participaci�n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese un n�mero mayor a cero: ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		while(n <= 0){
			System.out.print("ERROR, vuelva a ingresar un n�mero: ");
			n = teclado.nextInt();
		}
		if (n%2 == 0) {
			System.out.print(n + " es par.");
		}else {
			System.out.print(n + " es impar.");
		}
	}

}

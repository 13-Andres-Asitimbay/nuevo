package bucles;
import java.util.Scanner;
public class Participacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese un número entre 1 y 10: ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		while(n < 1 || n > 10){
			System.out.print("ERROR, vuelva a ingresar un número: ");
			n = teclado.nextInt();
		}
		System.out.print("Número Correcto.");
	}

}

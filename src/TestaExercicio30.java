import java.util.Scanner;
public class TestaExercicio30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Exercicio30 c = new Exercicio30();
		System.out.println("Entre com o 1° valor: ");
		c.seta (sc.nextInt());
		System.out.println("Entre com o 2° valor: ");
		c.setb (sc.nextInt());
		System.out.println("Entre com o 3° valor: ");
		c.setc (sc.nextInt());
		
		c.imprimeDados();

	}

}

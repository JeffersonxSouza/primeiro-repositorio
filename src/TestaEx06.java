import java.util.Scanner;
public class TestaEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Ex06 c = new Ex06();
		System.out.println("Insira os pontos do primeiro colocado: ");
		c.setprimeiro(sc.nextFloat());
		System.out.println("Insira os pontos do segundo colocado");
		c.setsegundo(sc.nextFloat());
		System.out.println("Insira os pontos do terceiro colocado");
		c.setterceiro(sc.nextFloat());
		
		c.imprimeDados();

	}

}

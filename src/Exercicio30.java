/*30) Criar um programa que leia os valores A, B, C, e imprima na tela o menor deles. Utilizar a
	classe Scanner
	 Jefferson Souza de Barros  RGM: 17315158*/
public class Exercicio30 {
	
	
	private int a;
	private int b;
	private int c;
	
	public int geta() {
		return a;
	}
	public void seta ( int a) {
		this.a = a;
	}
	public int getb() {
		return b;
	}
	public void setb ( int b) {
		this.b = b;
	}
	public int getc() {
		return c;
	}
	public void setc ( int c) {
		this.c =c;
	}
	
	public void imprimeDados() {
	if(a>b && a>c) {
		System.out.println("\nO maior valor é o priemiro: " + a);
		
	}else if(b>a && b>c) {
		
		System.out.println("\nO maior valor é o segundo: " + b);
	}else {
		
		System.out.println("\nO maior valor é o terceiro: " + c);
		}
	}
	
}

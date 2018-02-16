/*40) Escreva uma classe chamada Aluno que contenha os atributos privados denominados nome,
	matricula, nota1, nota2, nota3, peso1, peso2 e peso3. Além disso,
	a. Crie um construtor-padrão para a classe.
	b. Crie um construtor que inicialize todos os membros de dados com os valores recebidos como
	argumento.
	c. Crie os métodos de acesso (getters e setters) para todos os atributos. Os métodos setters devem
	validar os dados de entrada conforme as regras definidas abaixo:
	- o nome deve conter pelo menos dois caracteres;
	- a matrícula de ser constituída de 9 caracteres apenas;
	- d escreva um método público para calcular a média das três notas;
	  Jefferson Souza de Barros  RGM: 17315158*/
public class Aluno extends Exercicio18 {
	
	
	private String nome;
	private String matricula;
	private float n1,n2,n3,p1,p2,p3,media;

	
	public Aluno ( String nome, String matricula, float n1, float n2, float n3,  float p1,  float p2,  float p3) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome (String nome) {
		
		this.nome = nome;
	}
	
	public String getmatricula() {
		return matricula;
	}
	
	public void setmatricula (String matricula) {
		
		this.matricula = matricula;
	}
	
	public float getn1() {
		return n1;
	}
	
	public void setn1 (float n1) {
		this.n1 = n1;
	}
	public float getn2() {
		return n2;
	}
	
	public void setn2 (float n2) {
		this.n2 = n2;
	}
	public float getn3() {
		return n3;
	}
	
	public void setn3 (float n3) {
		this.n3 = n3;
	}
	public float getp1() {
		return p1;
	}
	public float getp2() {
		return p2;
	}
	public float getp3() {
		return p3;
	}
	
	public float getmedia() {
		return media;
	}
	public void setmedia (float media) {
		this.media = media;
	}
	
	public void validar() {
		
		if ( nome.length() <= 2) {
			System.out.println("Falta caracter!! \n Insira um nome válido");
			
			}
		
			if (matricula.length() != 9) {
				System.out.println("Número de matricula inválida!! \n Insira uma matrícula válida");
			}
	}
	
	
	public void imprimeDados() {
		
		media = ((this.getn1()*this.getp1())+(this.getn2()*this.getp2())+(this.getn3()*this.getp3()));
		media = media / (this.getp1() + this.getp2() + this.getp3());

		System.out.println("Aluno: " + getnome() +  "\n" +
		"Matricula: " + getmatricula() + "\n" +
		"Nota 1: " + getn1() +  "\n" +
		"Nota 2: " + getn2() +  "\n" +
		"Nota 3: " + getn3() +  "\n" +
		"A média é: " + media);
		
	}
	
	public Aluno() {
		
	}
	
}

/*18) Criar um programa que leia um vetor de inteiros de 10 posições e efetue a soma somente dos
	elementos ímpares.
	Jefferson Souza de Barros  RGM: 17315158*/
public class Exercicio18 {
	
	
	public void imprimeDados() {
		
		int v[] = {1,2,3,4,5,6,7,8,9,10};
		int soma =0;
		
		for (int i=0; i<v.length; i++) {
		
			if (v[i] % 2 !=0) {
				soma = soma + v[i];
			}
			
			
			
		}
		System.out.println(soma);
	}

}

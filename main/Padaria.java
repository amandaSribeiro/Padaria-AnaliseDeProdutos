package br.edu.fatec.execicio3.main;

public class Padaria {	
	
	int quantidadePaes;
	int quantidadeSonhos;
	int quantidadeLeite;
	
	public int getQuantidadePaes() {
		return quantidadePaes;
	}
	public void setQuantidadePaes(int quantidadePaes) {
		this.quantidadePaes = quantidadePaes;
	}
	public int getQuantidadeSonhos() {
		return quantidadeSonhos;
	}
	public void setQuantidadeSonhos(int quantidadeSonhos) {
		this.quantidadeSonhos = quantidadeSonhos;
	}
	public int getQuantidadeLeite() {
		return quantidadeLeite;
	}
	public void setQuantidadeLeite(int quantidadeLeite) {
		this.quantidadeLeite = quantidadeLeite;
	}
	public void imprimirDados() {
		System.out.println("Quantidade de pães: " + getQuantidadePaes());
		System.out.println("Quantidade de sonhos: " + getQuantidadeSonhos());
		System.out.println("Quantidade de Leite: " + getQuantidadeLeite());
		}
	
		public int verificar() {
			if (quantidadePaes > quantidadeSonhos && quantidadePaes > quantidadeLeite) {
				
				System.out.println("Você tem mais Paes! Quantidade: " + quantidadePaes);
			} 
			else if (quantidadeSonhos > quantidadePaes && quantidadeSonhos > quantidadeLeite) {
				
				System.out.println("Você tem mais Sonho! Quantidade: " + quantidadeSonhos);
				}
			
				else {
					System.out.println("Você tem mais Leite! Quantidade: " + quantidadeLeite);
				}
			return 0;
		}
}
	

	

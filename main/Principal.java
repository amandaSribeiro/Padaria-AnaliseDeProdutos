package br.edu.fatec.execicio3.main;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Padaria func = new Padaria();
		func.setQuantidadePaes(Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de pães: ")));
		func.setQuantidadeSonhos(Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de sonhos: ")));
		func.setQuantidadeLeite(Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de leite: ")));
		func.imprimirDados();
		func.verificar();
		
		}
	}



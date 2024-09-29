package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.Fila.*;
import model.Processo;
import controller.EscalonadorController;

public class Main {

	public static void main(String[] args) {
		Fila<Processo> f = new Fila<>();
		EscalonadorController escCont = new EscalonadorController();
		
		for(int i = 0; i < 6; i++) {
			Processo p = new Processo();
			p.setNome(JOptionPane.showInputDialog("Digite o nome do processo: "));
			p.setQtdRetornos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vezes desse processo: ")));
			f.insert(p);	
		}
		
		try {
			escCont.escalonador(f);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}

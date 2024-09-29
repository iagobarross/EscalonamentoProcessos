/*3. Considerando a biblioteca Fila Genérica, já criada, faça:
Criar um projeto Java (EscalonamentoProcessos) e importe a biblioteca FilaObject. Esse novo projeto irá
receber Objectos com dados de processos com o formato do objecto abaixo e simular o escalonamento
de processos RoundRobin.
A classe EscalonadorController no package controller deve ter 1 método:
• O método escalonador que recebe uma Fila de processos, como parâmetros, verifica se o número
que vezes é maior que 1, decrementa esse valor no objeto e, se for maior que 1, insere o objeto
novamente na fila;
A classe Principal, no package view, no seu método Main, deve inicializar uma fila Com processos, como
no exemplo abaixo
Objeto:
	
	Processo
	-Nome:String
	-qtdRetorno:int
	
Exemplo de entrada:
{"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"}
*/
package controller;

import br.edu.fateczl.Fila.*;
import model.Processo;

public class EscalonadorController {

	public EscalonadorController() {
		super();
	}

	public void escalonador(Fila<Processo> f) throws Exception {
		while (!f.isEmpty()) {
			try {
				Processo p = f.remove();
				if (p.getQtdRetornos() > 1) {
					p.setQtdRetornos(p.getQtdRetornos() - 1);
					f.insert(p);
					System.out
							.println("Processo " + p.getNome() + " executou uma vez. Faltam: " + p.getQtdRetornos());
				} else {
					p.setQtdRetornos(p.getQtdRetornos() - 1);
					System.out
							.println("Processo " + p.getNome() + " executou uma vez. Faltam: " + p.getQtdRetornos());
					
				}
			} catch (Exception e) {
				throw new Exception("Fila Vazia");
			}
		}
	}

}

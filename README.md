# Escalonamento de Processos

Este projeto Java simula o escalonamento de processos utilizando o algoritmo **Round Robin**.

## 📋 Descrição do Projeto
* O objetivo é simular um escalonador que gerencia processos em uma fila, executando-os ciclicamente até que sejam concluídos.
* O sistema utiliza uma biblioteca externa de **Fila Genérica** para organizar os processos.
* Cada processo é definido pelo seu **nome** e pela **quantidade de vezes** que precisa ser executado (retornos).

## ⚙️ Lógica de Escalonamento (Round Robin)
* O escalonador remove o processo do topo da fila e decrementa um ciclo de sua execução.
* Se o processo ainda possuir mais de uma execução pendente (quantidade > 1), ele é reinserido no final da fila.
* Caso contrário, o processo finaliza seu ciclo e não retorna à fila.
* A simulação continua até que a fila esteja completamente vazia.

## 🛠️ Tecnologias e Estrutura
* **Linguagem**: Java.
* **Dependências**: Requer a biblioteca `Fila.jar` (localizada na pasta `libs`) adicionada ao Build Path.
* **Pacotes**:
    * `model`: Classe `Processo` com os atributos do objeto.
    * `controller`: Classe `EscalonadorController` com a lógica de processamento.
    * `view`: Classe `Main` que inicializa o sistema e recebe os dados.

## 🚀 Como Executar
1. Importe o projeto em sua IDE (configurações do Eclipse inclusas).
2. Verifique se o arquivo `libs/Fila.jar` está corretamente referenciado no classpath.
3. Execute a classe `Main.java`.
4. O programa solicitará a entrada de **6 processos** via janelas de diálogo.
5. Informe o nome e a quantidade de ciclos para cada um e acompanhe o log de execução no console.

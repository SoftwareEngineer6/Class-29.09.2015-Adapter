package br.edu.univas.si6.es4.adapter;

public class Runner {

	public static void main(String[] args) {
		// Instanciando a biblioteca serial:
		SerialComm serialComm = new SerialAdapter(); // new SerialComm();

		// Autenticando:
		serialComm.login("teste", "teste1234");

		// Trocando mensagens:
		serialComm.sendMessage("Mensagem1");
		String message = serialComm.receiveMessage();
		System.out.println("Mensagem recebida: " + message);
		serialComm.sendMessage("Mensagem2");
		message = serialComm.receiveMessage();
		System.out.println("Mensagem recebida: " + message);
	}

}

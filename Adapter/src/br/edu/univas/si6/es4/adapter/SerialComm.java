package br.edu.univas.si6.es4.adapter;

import java.util.Random;

public class SerialComm {

	private Random random = new Random();

	public void login(String username, String password) {
		System.out.println("Autenticando através da classe SerialComm");
		System.out.println("User: " + username + " - Pass: " + password);
	}

	public void sendMessage(String message) {
		System.out.println("Enviando mensagem através da SerialComm");
		System.out.println("Mensagem: " + message);
	}

	public String receiveMessage() {
		String message = "MSG" + random.nextInt();
		System.out.println("Recebendo mensagem através da SerialComm");
		System.out.println("Mensagem: " + message);
		return message;
	}

}

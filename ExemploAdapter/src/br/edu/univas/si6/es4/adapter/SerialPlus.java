package br.edu.univas.si6.es4.adapter;

import java.util.Random;

public class SerialPlus {

	private Random random = new Random();
	private String data;

	public void authenticate(Credential credential) {
		System.out.println("Autenticando através da SerialPlus");
		System.out.println("User: " + credential.getUsername() +
				" - Pass: " + credential.getPassword());
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void send() {
		System.out.println("Enviando mensagem através da SerialPlus");
		System.out.println("Mensagem: " + data);
	}

	public void receive() {
		System.out.println("Recebendo mensagem através da SerialPlus");
		data = "MSG" + random.nextInt();
		System.out.println("Mensagem: " + data);
	}

}

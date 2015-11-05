package br.edu.univas.si6.es4.adapter;

public class SerialAdapter extends SerialComm {

	private SerialPlus plus = new SerialPlus();

	@Override
	public void login(String username, String password) {
		Credential credential = new Credential();
		credential.setUsername(username);
		credential.setPassword(password);
		plus.authenticate(credential);
	}

	@Override
	public void sendMessage(String message) {
		plus.setData(message);
		plus.send();
	}

	@Override
	public String receiveMessage() {
		plus.receive();
		return plus.getData();
	}

}

package io.maroni.banheiro;

public class Principal {
	public static void main(String[] args) {
		Banheiro banheiro = new Banheiro();
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
		Thread convidado3 = new Thread(new TarefaNumero2(banheiro), "Rafael");
		Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Lucas");

		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();
	}
}

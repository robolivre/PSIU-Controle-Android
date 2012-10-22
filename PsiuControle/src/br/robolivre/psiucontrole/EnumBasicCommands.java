package br.robolivre.psiucontrole;

import android.util.Log;

public class EnumBasicCommands {
	private BasicCommands basicCommands;
	private static final String TAG = "Enum";

	public EnumBasicCommands() {}

	public String forehead() {
		this.basicCommands = new BasicCommands();
		basicCommands.setCommand("parafrente");
		Log.v(TAG, "Frente");
		return "Para Frente";
	}

	public String backward() {
		this.basicCommands = new BasicCommands();
		basicCommands.setCommand("paratras");
		Log.v(TAG, "Tras");
		return "Para Tras";
	}

	public String turnLeft() {
		this.basicCommands = new BasicCommands();
		basicCommands.setCommand("giraesquerda");
		Log.v(TAG, "Esquerda");
		return "Gira Esquerda";
	}

	public String turnRight() {
		this.basicCommands = new BasicCommands();
		basicCommands.setCommand("giradireita");
		Log.v(TAG, "Direita");
		return "Gira Direita";
	}
}

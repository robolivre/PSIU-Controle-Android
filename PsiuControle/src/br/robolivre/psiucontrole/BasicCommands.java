package br.robolivre.psiucontrole;

import android.util.Log;

public class BasicCommands {
	private String command;
	private EnumBasicCommands enumCommand;
	private static final String TAG = "Basic";

	public BasicCommands() {
	}

	public String selectCommand(int num) {

		switch (num) {
		case 1:
			Log.v(TAG, "Frente");
			enumCommand = new EnumBasicCommands();
			return enumCommand.forehead();
		case 2:
			Log.v(TAG, "Tras");
			enumCommand = new EnumBasicCommands();
			return enumCommand.backward();
		case 3:
			Log.v(TAG, "Esquerda");
			enumCommand = new EnumBasicCommands();
			return enumCommand.turnLeft();
		case 4:
			Log.v(TAG, "Direita");
			enumCommand= new EnumBasicCommands();
			return enumCommand.turnRight();
		default:
			return "erro";
		}
	}

	void setCommand(String command) {
		this.command = command;
	}

	public String getCommand() {
		return this.command;
	}
	

}

package br.robolivre.psiucontrole;

import android.util.Log;

public class ProtocolBasic {
	private static final String TAG = "protocolBasic";
	private String protocol;
	private int stringSize, distance, cheksum;
	
	private String command;
	private RobotsName robotsName;
	private SendersName sender;
	
	public ProtocolBasic(String command) {
		Log.v(TAG, "Construtor");
		this.command = command;
		robotsName = new RobotsName();
		sender = new SendersName();
	}
	
	private String buildProtocol(){
		//this.protocol = robotsName.getName() + this.command + sender.getSender();
		return this.protocol;
	}

}

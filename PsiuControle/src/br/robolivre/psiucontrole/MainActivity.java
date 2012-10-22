package br.robolivre.psiucontrole;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	BasicCommands basicCommands;
	ProtocolBasic protocolBasic;
	private static final String TAG = "Main";
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void paraFrente(View v){
    	basicCommands = new BasicCommands();
    	basicCommands.selectCommand(1);
    	protocolBasic = new ProtocolBasic(basicCommands.getCommand());
    	Log.v(TAG, "Frente");
    }
    
    public void paraTras(View v){
    	basicCommands = new BasicCommands();
    	basicCommands.selectCommand(2);
    	protocolBasic = new ProtocolBasic(basicCommands.getCommand());
    	Log.v(TAG, "Tras");    	
    }
    
    public void giraEsquerda(View v){
    	basicCommands = new BasicCommands();
    	basicCommands.selectCommand(3);
    	protocolBasic = new ProtocolBasic(basicCommands.getCommand());
    	Log.v(TAG, "Esquerda");
    }
    
    public void giraDireita(View v){
    	basicCommands = new BasicCommands();
    	basicCommands.selectCommand(4);
    	protocolBasic = new ProtocolBasic(basicCommands.getCommand());
    	Log.v(TAG, "Direita");
    }
    
    public void qualSeuNome(View v){
    	
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
    
}

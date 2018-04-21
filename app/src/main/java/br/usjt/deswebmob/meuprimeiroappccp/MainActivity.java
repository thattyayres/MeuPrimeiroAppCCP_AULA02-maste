package br.usjt.deswebmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String MENSAGEM = " br.usjt.deswebmob.meuprimeiroappccp.msg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

        EditText txt = findViewById(R.id.edit_text);
        String msg = txt.getText().toString();
        Intent i = new Intent(this, displayMessageActivity.class);
        i.putExtra(MENSAGEM, msg);
        startActivity(i);
    }
}

package br.usjt.deswebmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class displayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent i = getIntent();
        String msg = i.getStringExtra(MainActivity.MENSAGEM);
        TextView txt = new TextView(this);
        txt.setTextSize(40);
        txt.setText(msg);
        ViewGroup layout = (ViewGroup)findViewById(R.id.activity_display_message);
        layout.addView(txt);

    }
}

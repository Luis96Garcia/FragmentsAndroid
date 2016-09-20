package com.example.luisg.applicationusingfragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowFragmentTwo extends AppCompatActivity {

    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show_fragment_two);

        int display_mode = getResources().getConfiguration().orientation;

        if (display_mode == Configuration.ORIENTATION_PORTRAIT) {

            boton = (Button) findViewById(R.id.button);
            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lanzar(v);
                }
            });
        }

    }

    public void lanzar(View view) {
        finish();
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }
}

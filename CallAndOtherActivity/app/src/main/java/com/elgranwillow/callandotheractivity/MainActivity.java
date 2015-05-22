package com.elgranwillow.callandotheractivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity{
    private Button btnNormal, btnParameters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNormal=(Button)findViewById(R.id.btnNormal);
        btnParameters=(Button)findViewById(R.id.btnParameter);
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        btnParameters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, activityWithParameter.class);
                Bundle b = new Bundle();
                b.putString("P1", "Hi");
                b.putString("P2","Thanks");
                intent.putExtras(b);
                startActivity(intent);
             }
        });

    }

}

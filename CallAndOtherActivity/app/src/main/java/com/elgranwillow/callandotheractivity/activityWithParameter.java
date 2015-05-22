package com.elgranwillow.callandotheractivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class activityWithParameter extends Activity {
    private TextView param1,param2;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_with_parameter);
        param1=(TextView)findViewById(R.id.textViewPara1);
        param2=(TextView)findViewById(R.id.textViewPara2);
        Bundle bundle = getIntent().getExtras();
        param1.setText(bundle.getString("P1"));
        param2.setText( bundle.getString("P2"));
        btnBack=(Button)findViewById(R.id.btnBackParameters);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(activityWithParameter.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

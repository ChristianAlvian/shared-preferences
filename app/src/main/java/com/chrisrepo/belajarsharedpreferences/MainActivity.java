package com.chrisrepo.belajarsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvUsername;
    private Button btnLogout;
    KendaliLogin KL = new KendaliLogin(MainActivity.this);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if(KL.isLogin(KL.KeyUsername)) == true){
            setContentView(R.layout.activity_main);
        }
        else{
            startActivities(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }

    }
}
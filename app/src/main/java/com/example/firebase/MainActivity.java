package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button BT;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BT = findViewById(R.id.services);

        // initialising all views through id defined above
        TextView forgetfulness = findViewById(R.id.text);
        forgetfulness.setText(
                "(Firebase Authentication)");
        // Set on Click Listener on Sign In button
        BT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Forward to LoginActivity
                Intent intent=new Intent(MainActivity.this,Services.class);
                startActivity(intent);
            }
        });
    }
}

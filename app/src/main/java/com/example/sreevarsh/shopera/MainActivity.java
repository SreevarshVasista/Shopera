package com.example.sreevarsh.shopera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_button=findViewById(R.id.add);
        add_button.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),ListDetails.class);
            startActivity(intent);
        });
    }
}
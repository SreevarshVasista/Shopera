package com.example.sreevarsh.shopera.Authentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sreevarsh.shopera.MainActivity;
import com.example.sreevarsh.shopera.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button login;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        email =findViewById(R.id.editTextPersonName);
        password=findViewById(R.id.editTextTextPassword);
        login=findViewById(R.id.button);

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser= mAuth.getCurrentUser();

        mAuth.signInWithEmailAndPassword(email.toString(),password.toString()).addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                Toast.makeText(Login.this, "Login, successful. Welcome!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }else {
                Toast.makeText(Login.this, "ERROR ! "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        login.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }

}
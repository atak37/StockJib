package com.example.stockjib;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText email, password;
    private Button back;
    private Button register;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firebaseAuth = FirebaseAuth.getInstance();

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        back = findViewById(R.id.back);
        register = findViewById(R.id.register);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(RegisterActivity.this, LoginActivityOld.class);
                startActivity(intent);
            }
        });



        //registers email and password into firebase
        //tests if exists or not then makes a toast depending on the answer
       /* register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getEmail = email.getText().toString();
                String getPassword = password.getText().toString();
                firebaseAuth.createUserWithEmailAndPassword(getEmail,getPassword)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(RegisterActivity.this, "User Account Was Created", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(RegisterActivity.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });*/
    }
}

package com.example.agenda2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin1 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telalogin1);

        Button btEntrar = (Button) findViewById(R.id.btEntrar);
        btEntrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText tLogin = (EditText) findViewById(R.id.tLogin);
                EditText tSenha = (EditText) findViewById(R.id.tSenha);

                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if(login.equals("josias")&& senha.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Login realizado com sucesso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), TelaContatos2.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

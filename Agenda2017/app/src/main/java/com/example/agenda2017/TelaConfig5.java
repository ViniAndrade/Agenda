package com.example.agenda2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TelaConfig5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaconfig5);
    }

    public void Voltar(View view){;
        Intent intent = new Intent(TelaConfig5.this, TelaContatos2.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Salvo com sucesso", Toast.LENGTH_SHORT).show();
        finish();

    };
}

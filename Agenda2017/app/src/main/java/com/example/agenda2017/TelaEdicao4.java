package com.example.agenda2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaEdicao4 extends AppCompatActivity {

    private EditText editarNome;
    private String TrocarNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telaedicao4);

        editarNome = (EditText) findViewById(R.id.editarNome);
    }

    public void salvar(View view){
        TrocarNome = editarNome.getText().toString();
        ControllerEditar.getInstance().setValue(TrocarNome);

        Intent intent = new Intent(TelaEdicao4.this, TelaContatos2.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Editado com sucesso", Toast.LENGTH_SHORT).show();
        finish();

    };


}

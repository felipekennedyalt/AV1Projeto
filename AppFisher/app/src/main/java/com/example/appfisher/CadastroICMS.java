package com.example.appfisher;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroICMS extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;
    private EditText txtEstadoOrigem;
    private EditText txtEstadoDestino;
    private EditText txtAliquota;
    private Button btSalvarICMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_i_c_m_s);

        txtEstadoOrigem = findViewById(R.id.txtEstadoOrigem);
        txtEstadoDestino = findViewById(R.id.txtEstadoDestino);
        txtAliquota = findViewById(R.id.txtAliquota);
        btSalvarICMS = findViewById(R.id.btSalvarICMS);

        btSalvarICMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               alertDialog = new AlertDialog.Builder(CadastroICMS.this);

                String mensagem = "";
                mensagem += "Estado de Origem: " + txtEstadoOrigem.getText().toString();
                mensagem += "\n Estado de Destino: " + txtEstadoDestino.getText().toString();
                mensagem += "\n Aliquota: " + txtAliquota.getText().toString();

                alertDialog.setTitle("ICMS salvo");
                alertDialog.setPositiveButton("OK", null);
                alertDialog.setMessage(mensagem);

                alertDialog.create();
                alertDialog.show();

            }
        });

    }
}

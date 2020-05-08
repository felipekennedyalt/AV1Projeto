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


    private String estadoOrigem;
    private String estadoDestino;
    private Double aliquota;

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }

    public String getEstadoDestino() {
        return estadoDestino;
    }

    public void setEstadoDestino(String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

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
                CadastroICMS icms = new CadastroICMS();
                icms.setEstadoOrigem(getEstadoOrigem());
                icms.setEstadoDestino(getEstadoDestino());
                icms.setAliquota(getAliquota());

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

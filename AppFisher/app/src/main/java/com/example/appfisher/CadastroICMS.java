package com.example.appfisher;

import androidx.appcompat.app.AlertDialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroICMS extends Activity {

    private AlertDialog.Builder alertDialog;
    private EditText txtEstado;
    private EditText txtAliquota;
    private Button btSalvarICMS;

<<<<<<< HEAD
    private String estado;
=======

    private String estadoOrigem;
    private String estadoDestino;
>>>>>>> 768f034c7f1d75b88f871da21c1506ce2542b298
    private Double aliquota;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

        txtEstado = findViewById(R.id.txtEstado);
        txtAliquota = findViewById(R.id.txtAliquota);
        btSalvarICMS = findViewById(R.id.btSalvarICMS);


        btSalvarICMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               alertDialog = new AlertDialog.Builder(CadastroICMS.this);

                String mensagem = "";
                mensagem += "Estado: " + txtEstado.getText().toString();
                mensagem += "\n Aliquota: " + txtAliquota.getText().toString();
                mensagem += "%";

                alertDialog.setTitle("ICMS salvo");
                alertDialog.setPositiveButton("OK", null);
                alertDialog.setMessage(mensagem);

                alertDialog.create();
                alertDialog.show();
            }
        });


    }
}

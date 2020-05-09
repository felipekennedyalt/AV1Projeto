package com.example.appfisher;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CadastroVendas extends Activity {

    private AlertDialog.Builder alertDialog;
    private EditText txtDataVenda;
    private EditText txtValorVenda;
    private RadioGroup compRadioGroup;
    private RadioButton compPago;
    private RadioButton compNPago;
    private EditText txtAliquotaVenda;
    private Button btSalvarVenda;

    private Double ValorVenda;

    public Double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        ValorVenda = valorVenda;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_vendas);


        txtDataVenda = findViewById(R.id.txtDataVenda);
        txtValorVenda = findViewById(R.id.txtValorVenda);
        compRadioGroup = findViewById(R.id.compRadioGroup);
        compPago = findViewById(R.id.compPago);
        compNPago = findViewById(R.id.compNPago);
        txtAliquotaVenda = findViewById(R.id.txtAliquotaVenda);
        btSalvarVenda = findViewById(R.id.btSalvarVenda);


        btSalvarVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(CadastroVendas.this);

                String mensagem = "";
                mensagem += "A venda foi feita em: " + txtDataVenda.getText().toString();
                mensagem += "\n Valor da venda: " + txtValorVenda.getText().toString();
                mensagem += "R$";
                if(compPago.isChecked()){
                    mensagem += "\n Status da venda: " + compPago.getText().toString();
                } else if(compNPago.isChecked()){
                    mensagem += "\n Status da venda: " + compNPago.getText().toString();
                }
                mensagem += "\n imposto do estado: " + txtAliquotaVenda.getText().toString();
                mensagem += "%";

                alertDialog.setTitle("Venda Salva");
                alertDialog.setPositiveButton("OK", null);
                alertDialog.setMessage(mensagem);

                alertDialog.create();
                alertDialog.show();
            }
        });

    }
}

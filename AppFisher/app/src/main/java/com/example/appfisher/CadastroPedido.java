package com.example.appfisher;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class CadastroPedido extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;
    private EditText txtDataPedido;
    private EditText txtValorPedido;
    private Button btsalvarPedido;
    private CheckBox checkTucunare;
    private CheckBox checkTraira;
    private CheckBox checkPirarucu;
    private CheckBox checkPintado;
    private CheckBox checkPacu;
    private EditText txtQtdTucunare;
    private EditText txtQtdTraira;
    private EditText txtQtdPirarucu;
    private EditText txtQtdPintado;
    private EditText txtQtdPacu;

    private Double valorPedido;

    public Double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Cadastro Pedido");
        }

        txtDataPedido = findViewById(R.id.txtDataPedido);
        txtValorPedido = findViewById(R.id.txtValorPedido);
        btsalvarPedido = findViewById(R.id.btSalvarPedido);
        checkTucunare = findViewById(R.id.checkTucunare);
        checkTraira = findViewById(R.id.checkTraira);
        checkPirarucu = findViewById(R.id.checkPirarucu);
        checkPintado = findViewById(R.id.checkPintado);
        checkPacu = findViewById(R.id.checkPacu);
        txtQtdTucunare = findViewById(R.id.txtQtdTucunare);
        txtQtdTraira = findViewById(R.id.txtQtdTraira);
        txtQtdPirarucu = findViewById(R.id.txtQtdPirarucu);
        txtQtdPintado = findViewById(R.id.txtQtdPintado);
        txtQtdPacu = findViewById(R.id.txtQtdPacu);


        btsalvarPedido.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            alertDialog = new AlertDialog.Builder(CadastroPedido.this);

            String mensagem = "";
            mensagem += "O pedido foi feito em: " + txtDataPedido.getText().toString();
            mensagem += "\n Peixes selecionados: ";
            if(checkTucunare.isChecked()){
                mensagem += " " + checkTucunare.getText().toString() + " x" + txtQtdTucunare.getText().toString();
            }if(checkTraira.isChecked()){
                mensagem += ", " + checkTraira.getText().toString() + " x" + txtQtdTraira.getText().toString();
            }if(checkPirarucu.isChecked()){
                mensagem += ", " + checkPirarucu.getText().toString() + " x" + txtQtdPirarucu.getText().toString();
            }if(checkPintado.isChecked()){
                mensagem += ", " + checkPintado.getText().toString() + " x" + txtQtdPintado.getText().toString();
            }if(checkPacu.isChecked()){
                mensagem += ", " + checkPacu.getText().toString() + " x" + txtQtdPacu.getText().toString();
            }
            mensagem += "\n Valor do pedido: " + txtValorPedido.getText().toString();
            mensagem += "R$";

            alertDialog.setTitle("Pedido Salvo");
            alertDialog.setPositiveButton("OK", null);
            alertDialog.setMessage(mensagem);

            alertDialog.create();
            alertDialog.show();
            }
        });
    }
}

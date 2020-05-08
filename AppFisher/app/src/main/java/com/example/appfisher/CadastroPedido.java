package com.example.appfisher;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroPedido extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;
    private EditText txtDataPedido;
    private EditText txtValorPedido;
    private Button btsalvarPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);

        txtDataPedido = findViewById(R.id.txtDataPedido);
        txtValorPedido = findViewById(R.id.txtValorPedido);
        btsalvarPedido = findViewById(R.id.btSalvarPedido);

        btsalvarPedido.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            alertDialog = new AlertDialog.Builder(CadastroPedido.this);

            String mensagem = "";
            mensagem += "O pedido foi feito em: " + txtDataPedido.getText().toString();
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

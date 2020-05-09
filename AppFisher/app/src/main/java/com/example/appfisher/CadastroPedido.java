package com.example.appfisher;

import androidx.appcompat.app.AlertDialog;
<<<<<<< HEAD

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class CadastroPedido extends Activity {
=======
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroPedido extends AppCompatActivity {
>>>>>>> 768f034c7f1d75b88f871da21c1506ce2542b298

    private AlertDialog.Builder alertDialog;
    private EditText txtDataPedido;
    private EditText txtValorPedido;
    private Button btsalvarPedido;
<<<<<<< HEAD
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
=======
>>>>>>> 768f034c7f1d75b88f871da21c1506ce2542b298

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);

        txtDataPedido = findViewById(R.id.txtDataPedido);
        txtValorPedido = findViewById(R.id.txtValorPedido);
        btsalvarPedido = findViewById(R.id.btSalvarPedido);
<<<<<<< HEAD
        checkTucunare = findViewById(R.id.checkTucunare);
        checkTraira = findViewById(R.id.checkTraira);
        checkPirarucu = findViewById(R.id.checkPirarucu);
        checkPintado = findViewById(R.id.checkPintado);
        checkPacu = findViewById(R.id.checkPacu);
        txtQtdTucunare = findViewById(R.id.txtQtdPirarucu);
        txtQtdTraira = findViewById(R.id.txtQtdTraira);
        txtQtdPirarucu = findViewById(R.id.txtQtdPirarucu);
        txtQtdPintado = findViewById(R.id.txtQtdPintado);
        txtQtdPacu = findViewById(R.id.txtQtdPacu);

=======
>>>>>>> 768f034c7f1d75b88f871da21c1506ce2542b298

        btsalvarPedido.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            alertDialog = new AlertDialog.Builder(CadastroPedido.this);

            String mensagem = "";
            mensagem += "O pedido foi feito em: " + txtDataPedido.getText().toString();
<<<<<<< HEAD
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
=======
>>>>>>> 768f034c7f1d75b88f871da21c1506ce2542b298
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

package com.example.appfisher;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuPrincipal extends Activity {

    private TextView txtLoginMenu;
    private TextView txtSenhaMenu;
    private Button btICMS;
    private Button btPedido;
    private Button btVenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);


        txtLoginMenu = findViewById(R.id.txtLoginMenu);
        txtSenhaMenu = findViewById(R.id.txtSenhaMenu);
        btICMS = findViewById(R.id.btICMS);
        btPedido = findViewById(R.id.btPedido);
        btVenda = findViewById(R.id.btVenda);

        Bundle extras = getIntent().getExtras();

        if (extras != null){
            txtLoginMenu.setText( extras.getString("login"));
            txtSenhaMenu.setText( extras.getString("senha"));

        }

        btICMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, CadastroICMS.class);

                startActivity(intent);
            }
        });

        btPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, CadastroPedido.class);

                startActivity(intent);
            }
        });

        btVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this, CadastroVendas.class);

                startActivity(intent);
            }
        });
    }
}

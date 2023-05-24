package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.controller.Dados;

public class MainActivity extends AppCompatActivity {
    Dados dados = new Dados();
    private Button bnt;
    private EditText nome, senha;
    private TextView show, show1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        HandleClick();
    }

    private void HandleClick(){
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dados.setNome(String.valueOf(nome.getText()));
                dados.setSenha(String.valueOf(senha.getText()));


            }
        });
    }

    private void initComponents(){
        bnt = findViewById(R.id.button);
        nome = findViewById(R.id.User);
        senha = findViewById(R.id.Senha);
        show = findViewById(R.id.textView);
        show1 = findViewById(R.id.textView2);
    }

//    private void Teste(){
//        Intent intent = new Intent(MainActivity.this, Main.class);
//        startActivity(intent);
//    }
}
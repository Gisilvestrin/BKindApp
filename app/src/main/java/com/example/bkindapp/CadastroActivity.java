package com.example.bkindapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void onClickCriarContaInstituicao(View v) {
        Intent intent = new Intent(this, CadastroInstituicaoActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickCriarContaPessoa(View v) {
        Intent intent = new Intent(this, CadastroPessoaActivity.class);
        startActivity(intent);
        finish();

    }
}
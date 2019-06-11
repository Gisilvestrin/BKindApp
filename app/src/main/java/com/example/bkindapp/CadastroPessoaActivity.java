package com.example.bkindapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CadastroPessoapart2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa);
    }
    public void onClickCriarContaPessoapart2(View v) {
        Intent intent = new Intent(this, CadastroPessoaPart2Activity.class);
        startActivity(intent);
        finish();
    }
}

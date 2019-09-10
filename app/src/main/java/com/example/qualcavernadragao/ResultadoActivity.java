package com.example.qualcavernadragao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {
    TextView tvNome;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvNome = findViewById(R.id.tvNome);
        tvResultado = findViewById(R.id.tvResultado);

        String nome = this.getIntent().getStringExtra("nome");
        String[] personagens = { "Hank", "Eric", "Diana", "Presto", "Sheila", "Bobby", "Mestre dos Magos", "Uni", "Vingador", "Tiamat", "Demônio das Sombras"};
        int qual = new Random().nextInt(10);

        tvNome.setText(nome);
        tvResultado.setText(personagens[qual]);
    }
}

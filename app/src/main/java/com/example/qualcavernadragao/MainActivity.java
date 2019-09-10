package com.example.qualcavernadragao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edNome;
    EditText edData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNome = findViewById(R.id.edNome);
        edData = findViewById(R.id.edData);
    }

    public void onClick(View view) {
        String nome = edNome.getText().toString();
        String data = edData.getText().toString();

        Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
        intent.putExtra("nome", nome);
        intent.putExtra("data", data);
        startActivity(intent);
    }
}

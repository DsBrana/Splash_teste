package com.example.splash_teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class LoadingA_Activity extends AppCompatActivity {
    ProgressBar horizontal, rotatorio;
    Button carregamento;
    int progresso = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadinga);

        horizontal = findViewById (R.id.pb00_sTeste);

        rotatorio = findViewById (R.id.pb01_sTeste);
        rotatorio.setVisibility (View.GONE);

        carregamento = findViewById (R.id.bt00_sTeste);
        carregamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loading(view);
            }
        });


    }

    public void loading(View view) {
        this.progresso = this.progresso + 1;

        horizontal.setProgress (progresso);
        if (this.progresso == 10 ) {
            progresso = -1;
            rotatorio.setVisibility(View.GONE);
            }

        rotatorio.setVisibility (View.VISIBLE);
        rotatorio.setProgress (progresso);
    }


}
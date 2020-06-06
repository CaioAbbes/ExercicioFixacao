package com.example.exerciciofixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }
    public void enviarEmail(View view) throws UnsupportedEncodingException {

        //formata o conteúdo do email
        String uriText =
                "mailto:seuemail@gmail.com" +
                        "?subject=" + URLEncoder.encode("assunto do email", "utf-8") +
                        "&body=" + URLEncoder.encode("texto do email", "utf-8");
        Uri uri = Uri.parse(uriText);
        //inicia a Intent
        Intent it = new Intent(Intent.ACTION_SENDTO);
        //Define o conteúdo
        it.setData(uri);
        //Inicia a activity para enviar o email
        startActivity(Intent.createChooser(it, "Enviar Email"));

    }
}

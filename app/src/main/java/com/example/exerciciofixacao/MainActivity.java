package com.example.exerciciofixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //ve a tela

    }

    public void  Email (View view) {
        startActivity(new Intent(MainActivity.this, EmailActivity.class));
    }

    public void Busca (View view){
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = "Museu de Arte de São Paulo";
        intent.putExtra(SearchManager.QUERY, query);
        startActivity(intent);
    }
    public void Navegacao (View view){
        Uri location= Uri.parse("geo:0,0?q=Museu+de+Arte+de+São+Paulo+Assis+Chateaubriand");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent );
    }
}
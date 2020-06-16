package com.example.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nome = "Jota";
        Integer numeroInteiro = 30;
        Double numeroQuebrado = 2.7;
        Boolean mentirosinho = false;

        Log.i("LOG", " eai galera");
    }
}

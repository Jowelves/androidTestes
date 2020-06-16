package frasesdodia.studio.com.fraesedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases ={"As pessoas que vendem receitas para a felicidade já encontraram a sua: ganhar dinheiro enganando os outros.",
            "Em meio a tempestade, seja como o chão, furacão veem, mas ele não te leva.",
            "Todos os problemas que aparecem nas nossas vidas trazem nos uma grande lição de vida, e a realidade que emfrentamos no nosso dia pos dia do mundo actual.",
            "Você só chegará lá com os desafios e não com suas fraquezas."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

       // textoNovaFrase.setText( frases [1]);
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText( frases [numeroAleatorio]);
            }
        });

    }
}

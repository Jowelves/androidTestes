package gasolinaoualcool.studio.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);


        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperar texto digitado

                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina =  precoGasolina.getText().toString();

                //converter textos em valores para numeros
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);
                //alcool/gasolina
                Double resultado = valorAlcool/valorGasolina;

                if (resultado >= 0.7){
                    textoResultado.setText("É melhor usar Gasolina!");
                    Toast.makeText(getApplicationContext(), "Escolha a gasolina!", Toast.LENGTH_LONG).show();

                }else{
                    textoResultado.setText("É melhor usar Álcool!");
                    Toast.makeText(getApplicationContext(), "Humm Álcool, uma boa escolha!", Toast.LENGTH_LONG).show();
                }



            }
        });


    }
}

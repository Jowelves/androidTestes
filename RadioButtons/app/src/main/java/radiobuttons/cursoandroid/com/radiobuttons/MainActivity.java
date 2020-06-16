package radiobuttons.cursoandroid.com.radiobuttons;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    private RadioGroup radiogroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoEscolher;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogroup = (RadioGroup) findViewById(R.id.radiogroupId);
        botaoEscolher = (Button) findViewById(R.id.botaoEscolherId);
        textoExibicao = (TextView)findViewById(R.id.textoExibicaoId);
        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRaddioButtonEscolhido = radiogroup.getCheckedRadioButtonId();
                textoExibicao.setText("id; "+ R.id.radiogroupId);

                if(idRaddioButtonEscolhido > 0){
                    radioButtonEscolhido = (RadioButton) findViewById(idRaddioButtonEscolhido);
                    textoExibicao.setText(radioButtonEscolhido.getText());
                }
            }
        });

    }
}

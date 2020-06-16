package seekbar.cursoandroid.com.seekbar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private SeekBar seekbar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = (SeekBar)findViewById(R.id.seekBarId);

        textoExibicao = (TextView) findViewById(R.id.tetoExibicaoId);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //chamado sempre que a barra se movimentar
                textoExibicao.setText("Proresso: "+ i+" / "+ seekbar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //metodo chamado quando pressionado o seekbar
                Toast.makeText(MainActivity.this,"Botão Seekbar Pressionado!",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //metodo chamado quando seekbar for solto
                Toast.makeText(MainActivity.this, "Botão Seekbar não está sendo pressionado!\n dado salvo!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

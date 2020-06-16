package qualserie.cursoandroid.com.qualserie;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private SeekBar seekbar;
    private ImageView imagemExibicao;
    private TextView texto;
    public int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = (SeekBar) findViewById(R.id.seekBarId);
        imagemExibicao = (ImageView)findViewById(R.id.imagemExibicaoId);
        texto = (TextView) findViewById(R.id.textoId);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int valorProgresso = i;
                texto.setText("Escolha: "+i+" / "+ seekbar.getMax());
                 x= i;
                if(valorProgresso==1 ){
                    imagemExibicao.setImageResource(R.drawable.pouco);
                }else if(valorProgresso==2){
                    imagemExibicao.setImageResource(R.drawable.medio);
                }else if(valorProgresso==3){
                    imagemExibicao.setImageResource(R.drawable.muito);
                } else if(valorProgresso==4){
                    imagemExibicao.setImageResource(R.drawable.susto);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Selecionando escolha!",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this," você escolheu: "+x+" .",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

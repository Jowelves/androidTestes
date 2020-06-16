package mediaplayer.cursoandroid.com.mediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button botaoTocar;
    private MediaPlayer mediaPlayer;
    private Button botaoPlay;
    private Button botaoPausar;
    private Button botaoStop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoTocar = (Button)findViewById(R.id.botaoTocarId);
        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.musica);
        //feito por mim{
        botaoPlay = (Button)findViewById(R.id.botaoPlayId);
        botaoPausar = (Button)findViewById(R.id.botaoPausarId);
        botaoStop = (Button)findViewById(R.id.botaoStopId);

        // }

        botaoTocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    pausarMusica();
                }else{tocarMusica();}
            }
        });

        botaoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarMusica();
            }
        });

        botaoPausar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
               pausarMusica();
                }
            }
        });

        botaoStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    stopMusica();
                }

            }
        });



    }
    private void tocarMusica(){
        if (mediaPlayer != null){
            mediaPlayer.start();
            botaoTocar.setText("Pausar");
        }

    }

    private void pausarMusica(){
        if (mediaPlayer!=null){
            mediaPlayer.pause();
    botaoTocar.setText("Tocar");
        }
    }

    private void stopMusica(){
        if (mediaPlayer!=null){
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer!=null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();
    }

}

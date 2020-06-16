package aulaactivity.studio.com.aulaactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SegundaActivity extends Activity {
private Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        botao = (Button) findViewById(R.id.boatoSegundaId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SegundaActivity.this, MainActivity.class));
                Toast.makeText(getApplicationContext(), "mensagem2", Toast.LENGTH_LONG).show();
            }
        });
    }

}

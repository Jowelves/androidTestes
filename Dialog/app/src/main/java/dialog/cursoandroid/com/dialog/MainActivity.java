package dialog.cursoandroid.com.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //criar alert dialog
                dialog = new AlertDialog.Builder(MainActivity.this);
                //configurar o titulo
                dialog.setTitle("Titulo dialog, deseja excluir?");
                //configurar a mensagem
                dialog.setMessage("Mensagem da dialog");
                //impedir de sair sem uma escolha
                dialog.setCancelable(false);
                dialog.setIcon(android.R.drawable.ic_delete);

                //botao do não
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i){
                                Toast.makeText(MainActivity.this,"Pressionando o botão não",Toast.LENGTH_SHORT).show();

                            }
                        });
                //botão do sim
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                Toast.makeText(MainActivity.this, "Pressionando o botão sim", Toast.LENGTH_SHORT).show();
                            }
                        }
                );

                dialog.create();
                dialog.show();

            }
        });

    }
}

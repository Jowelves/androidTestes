package checkbox.cursoandroid.com.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private CheckBox checkBoxCao;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;

    private Button botaoMostrar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCao= (CheckBox)findViewById(R.id.checkBoxCaoId);
        checkBoxGato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        checkBoxPapagaio= (CheckBox)findViewById(R.id.checkBoxPapagaioId);

        textoExibicao = (TextView)findViewById(R.id.textoExibicaoId);

        botaoMostrar= (Button) findViewById(R.id.botaoMostrarId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itensSelecionados= "" ;


                Boolean cao = checkBoxCao.isChecked();
                Boolean gato = checkBoxGato.isChecked();
                Boolean papagaio = checkBoxPapagaio.isChecked();

               /*  if (checkBoxCao.isChecked()== true){
                  itensSelecionados += "Item: "+ checkBoxCao.getText() + " Status " + checkBoxCao.isChecked() +"\n";
              }else {itensSelecionados += "Item não selecionado";}*/

                if (cao || gato || papagaio == true) {
                    if (cao == true) {
                        itensSelecionados += "Item: " + checkBoxCao.getText() + " Status " + checkBoxCao.isChecked() + "\n";
                    }
                    if (gato == true) {
                        itensSelecionados += "Item: " + checkBoxGato.getText() + " Status " + checkBoxGato.isChecked() + "\n";
                    }
                    if (papagaio == true) {
                        itensSelecionados += "Item: " + checkBoxPapagaio.getText() + " Status " + checkBoxPapagaio.isChecked() + "\n";
                    } }
                else{
                    itensSelecionados += "Item vazio! no teste de checkBox ";}

//codigos do curso
             //  itensSelecionados += "Item: "+ checkBoxCao.getText() + "Status" + checkBoxCao.isChecked() +"\n";
              //  itensSelecionados += "Item: "+ checkBoxGato.getText()+ "Sttus" + checkBoxGato.isChecked()+"\n";
               // itensSelecionados += "Item: "+ checkBoxPapagaio.getText()+"Status" + checkBoxPapagaio.isChecked() +"\n";


                textoExibicao.setText(itensSelecionados);}
        });
    }
}

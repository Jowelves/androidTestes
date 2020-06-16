package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
        private ListView listaSignos;
    private String[] signos= {
            "Áries","Touro","Gêmeos","Câncer","Leão", "Virgem", "Libra",
            "Escorpião","Sargitário", "Capricórnio", "Aquário", "Peixes"
    };
    private String[] perfis = {
      "Arianos são animados, independetes, individualistas, dinâmicos, corajosos e aventureiros",
            "Taurinos são positivos, pacientes, determinados, noturnos, leais e româticos",
            "Geminianos são positivos, mutáveis, racionais e bastante voláteis",
            "Cânceriano são emotivos, carinhosos, protetores e simpáticos. Um canceriano" +
                    " tem muita imaginação e intuição. Sabe ser cauteloso quando precisa.",
            "Leão tem muita imaginação e intuição. Sabe ser cauteloso quando precisa.",
            "Virgem tem muita imaginação",
            "Libra",
            "Escorpião",
            "Sargitário",
            "Capricórnio",
            "Aquário",
            "Peixes"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    listaSignos = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
          getApplicationContext(),
          android.R.layout.simple_list_item_1,
          android.R.id.text1,
          signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                int codigoPosicao = i ;
                Toast.makeText(getApplicationContext(), perfis[codigoPosicao ], Toast.LENGTH_SHORT).show();
            }


        });
    }
}
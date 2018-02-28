package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button   botaoNovaFrase;

    //array
    private String [] frases = {
            "A persistência é o caminho do êxito.",
            "O que não provoca minha morte faz com que eu fique mais forte.",
            "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo.",
            "O que me preocupa não é o grito dos maus. É o silêncio dos bons."};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //localiza o botao,etc na tela e atribui o valor na variavel textoNovaFrase
        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);




        //o botão vai ter um evento de click. O new é usado para instanciar.
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando uma classe random
                Random randomico = new Random();

                //cria numero aleatorio de acordo com o tamanho do array
                int numeroAleatorio = randomico.nextInt(frases.length);

                // exibe a nova frase
                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}

package tests.com.example.jeuxpuissancequatre;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String joueur1=null;
    String joueur2=null;
    EditText nomJoueur1=null;
    EditText nomJoueur2=null;
    Button commencer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomJoueur1=findViewById(R.id.choixNomJoueurUn);
        nomJoueur2=findViewById(R.id.choixNomJoueur2);
        commencer=findViewById(R.id.commencer);
        nomJoueur1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                joueur1=nomJoueur1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        nomJoueur2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                joueur2=nomJoueur2.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
    public void commencer(View v){

        startActivity(new Intent(this,Jeux.class).putExtra("joueurUn",joueur1).putExtra("joueurDeux",joueur2));
    }
}

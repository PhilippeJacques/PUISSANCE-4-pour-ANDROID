package tests.com.example.jeuxpuissancequatre;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Jeux extends AppCompatActivity {

    String joueur1;
    String joueur2;
    Colonne colonne1=null;
    Colonne colonne2=null;
    Colonne colonne3=null;
    Colonne colonne4=null;
    Colonne colonne5=null;
    
    
    ImageView[] jetonCol1=new ImageView[5];
    ImageView[] jetonCol2=new ImageView[5];
    ImageView[] jetonCol3=new ImageView[5];
    ImageView[] jetonCol4=new ImageView[5];
    ImageView[] jetonCol5=new ImageView[5];
    
    
    ImageView col1Jeton1=null;
    ImageView col1Jeton2=null;
    ImageView col1Jeton3=null;
    ImageView col1Jeton4=null;
    ImageView col1Jeton5=null;

    ImageView col2Jeton1=null;
    ImageView col2Jeton2=null;
    ImageView col2Jeton3=null;
    ImageView col2Jeton4=null;
    ImageView col2Jeton5=null;

    ImageView col3Jeton1=null;
    ImageView col3Jeton2=null;
    ImageView col3Jeton3=null;
    ImageView col3Jeton4=null;
    ImageView col3Jeton5=null;

    ImageView col4Jeton1=null;
    ImageView col4Jeton2=null;
    ImageView col4Jeton3=null;
    ImageView col4Jeton4=null;
    ImageView col4Jeton5=null;
    
    ImageView col5Jeton1=null;
    ImageView col5Jeton2=null;
    ImageView col5Jeton3=null;
    ImageView col5Jeton4=null;
    ImageView col5Jeton5=null;

    Button buttonFin=null;
    Button buttonCol1=null;
    Button buttonCol2=null;
    Button buttonCol3=null;
    Button buttonCol4=null;
    Button buttonCol5=null;
    int colonneAuMax=0;

    Colonne[] tabDeColonne= new Colonne[5];
    

    TextView aQui;
    int tourDe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeux);

        buttonFin=findViewById(R.id.buttonFin);
        buttonCol1=findViewById(R.id.buttonCol1);
        buttonCol2=findViewById(R.id.buttonCol2);
        buttonCol3=findViewById(R.id.buttonCol3);
        buttonCol4=findViewById(R.id.buttonCol4);
        buttonCol5=findViewById(R.id.buttonCol5);


        col1Jeton1=findViewById(R.id.colonne1Jeton1);
        col1Jeton2=findViewById(R.id.colonne1Jeton2);
        col1Jeton3=findViewById(R.id.colonne1Jeton3);
        col1Jeton4=findViewById(R.id.colonne1Jeton4);
        col1Jeton5=findViewById(R.id.colonne1Jeton5);
        jetonCol1[0]=col1Jeton1;
        jetonCol1[1]=col1Jeton2;
        jetonCol1[2]=col1Jeton3;
        jetonCol1[3]=col1Jeton4;
        jetonCol1[4]=col1Jeton5;

        col2Jeton1=findViewById(R.id.colonne2Jeton1);
        col2Jeton2=findViewById(R.id.colonne2Jeton2);
        col2Jeton3=findViewById(R.id.colonne2Jeton3);
        col2Jeton4=findViewById(R.id.colonne2Jeton4);
        col2Jeton5=findViewById(R.id.colonne2Jeton5);
        jetonCol2[0]=col2Jeton1;
        jetonCol2[1]=col2Jeton2;
        jetonCol2[2]=col2Jeton3;
        jetonCol2[3]=col2Jeton4;
        jetonCol2[4]=col2Jeton5;

        col3Jeton1=findViewById(R.id.colonne3Jeton1);
        col3Jeton2=findViewById(R.id.colonne3Jeton2);
        col3Jeton3=findViewById(R.id.colonne3Jeton3);
        col3Jeton4=findViewById(R.id.colonne3Jeton4);
        col3Jeton5=findViewById(R.id.colonne3Jeton5);
        jetonCol3[0]=col3Jeton1;
        jetonCol3[1]=col3Jeton2;
        jetonCol3[2]=col3Jeton3;
        jetonCol3[3]=col3Jeton4;
        jetonCol3[4]=col3Jeton5;
        
        col4Jeton1=findViewById(R.id.colonne4Jeton1);
        col4Jeton2=findViewById(R.id.colonne4Jeton2);
        col4Jeton3=findViewById(R.id.colonne4Jeton3);
        col4Jeton4=findViewById(R.id.colonne4Jeton4);
        col4Jeton5=findViewById(R.id.colonne4Jeton5);
        jetonCol4[0]=col4Jeton1;
        jetonCol4[1]=col4Jeton2;
        jetonCol4[2]=col4Jeton3;
        jetonCol4[3]=col4Jeton4;
        jetonCol4[4]=col4Jeton5;
        
        col5Jeton1=findViewById(R.id.colonne5Jeton1);
        col5Jeton2=findViewById(R.id.colonne5Jeton2);
        col5Jeton3=findViewById(R.id.colonne5Jeton3);
        col5Jeton4=findViewById(R.id.colonne5Jeton4);
        col5Jeton5=findViewById(R.id.colonne5Jeton5);
        jetonCol5[0]=col5Jeton1;
        jetonCol5[1]=col5Jeton2;
        jetonCol5[2]=col5Jeton3;
        jetonCol5[3]=col5Jeton4;
        jetonCol5[4]=col5Jeton5;


        colonne1=new Colonne(jetonCol1);
        colonne2=new Colonne(jetonCol2);
        colonne3=new Colonne(jetonCol3);
        colonne4=new Colonne(jetonCol4);
        colonne5=new Colonne(jetonCol5);


        tabDeColonne[0]=colonne1;
        tabDeColonne[1]=colonne2;
        tabDeColonne[2]=colonne3;
        tabDeColonne[3]=colonne4;
        tabDeColonne[4]=colonne5;


        tourDe=1;
        joueur1 = getIntent().getStringExtra("joueurUn");
        joueur2 = getIntent().getStringExtra("joueurDeux");
        aQui = findViewById(R.id.aQuiJouer);
        aQui.setTextColor(Color.rgb(0,0,0));
        aQui.setText(String.format("%s C'est ton tour", joueur1));
        ConstraintLayout layout = findViewById(R.id.layout);
        layout.setBackgroundResource(R.drawable.ecran);


    }
    @SuppressLint("SetTextI18n")
    public void boutonCol1(View v){

        if (colonneAuMax==4 && verifPlaceTouteLesColonnes()){
            if (colonne1.jeton[4].getTag().equals("jeton_noire")){
                colonne1.ajouterJeton(tourDe);
            }
            buttonFin.setEnabled(true);
            aQui.setText("La partie est terminé toutes les cases sont remplies");
        }else {
            try {
                colonneAuMax+=Integer.parseInt(colonne1.ajouterJeton(tourDe));
            }catch (Exception e){

            }

        }
        verfieWinGeneral();
    }
    @SuppressLint("SetTextI18n")
    public void boutonCol2(View v){

        if (colonneAuMax==4&& verifPlaceTouteLesColonnes()) {
            if (colonne2.jeton[4].getTag().equals("jeton_noire")){
                colonne2.ajouterJeton(tourDe);
            }
            buttonFin.setEnabled(true);
            aQui.setText("La partie est terminé toutes les cases sont remplies");
        }else {

            colonneAuMax+=Integer.parseInt(colonne2.ajouterJeton(tourDe));
        }
        verfieWinGeneral();
    }
    @SuppressLint("SetTextI18n")
    public void boutonCol3(View v){

        if (colonneAuMax==4&& verifPlaceTouteLesColonnes()){
            if (colonne3.jeton[4].getTag().equals("jeton_noire")){
                colonne3.ajouterJeton(tourDe);
            }
            buttonFin.setEnabled(true);
            aQui.setText("La partie est terminé toutes les cases sont remplies");
        }else {
            colonneAuMax+=Integer.parseInt(colonne3.ajouterJeton(tourDe));
        }
        verfieWinGeneral();
    }
    @SuppressLint("SetTextI18n")
    public void boutonCol4(View v){

        if (colonneAuMax==4&& verifPlaceTouteLesColonnes()){
            if (colonne4.jeton[4].getTag().equals("jeton_noire")){
                colonne4.ajouterJeton(tourDe);
            }
            buttonFin.setEnabled(true);
            aQui.setText("La partie est terminé toutes les cases sont remplies");
        }else{
            colonneAuMax+=Integer.parseInt(colonne4.ajouterJeton(tourDe));

        }
        verfieWinGeneral();

    }
    @SuppressLint("SetTextI18n")
    public void boutonCol5(View v){

        if (colonneAuMax==4&& verifPlaceTouteLesColonnes()){
            if (colonne5.jeton[4].getTag().equals("jeton_noire")){
                colonne5.ajouterJeton(tourDe);
            }
            buttonFin.setEnabled(true);
            aQui.setText("La partie est terminé toutes les cases sont remplies");
        }else {
            colonneAuMax+=Integer.parseInt(colonne5.ajouterJeton(tourDe));

        }
        verfieWinGeneral();

    }
    public void boutonFin(View v){
        Jeux.this.finish();
    }
    public void tour(){
        if(tourDe==1){
            tourDe=2;
            aQui.setText(String.format("%s C'est ton tour", joueur2));
        }else if (tourDe==2){
            tourDe=1;
            aQui.setText(String.format("%s C'est ton tour", joueur1));
        }

    }
    public boolean verifPlaceTouteLesColonnes(){
        if (colonne1.emplacementColonneVidePrecis(3).equals("20") && colonne2.emplacementColonneVidePrecis(3).equals("20") && colonne3.emplacementColonneVidePrecis(3).equals("20")
                && colonne4.emplacementColonneVidePrecis(3).equals("20") && colonne5.emplacementColonneVidePrecis(3).equals("20")){
            buttonFin.setEnabled(true);
            return true;
        }
        return false;
    }
    public void verifPlaceColonne1(){
        if (colonne1.emplacementColonneVidePrecis(4).equals("20")||colonne1.emplacementColonneVidePrecis(4).equals("20")){
            buttonCol1.setEnabled(false);
        }
    }
    public void verifPlaceColonne2(){
        if (colonne2.emplacementColonneVidePrecis(4).equals("20")||colonne2.emplacementColonneVidePrecis(4).equals("20")){
            buttonCol2.setEnabled(false);
        }
    }
    public void verifPlaceColonne3(){
        if (colonne3.emplacementColonneVidePrecis(4).equals("20")||colonne3.emplacementColonneVidePrecis(4).equals("20")){
            buttonCol3.setEnabled(false);
        }
    }
    public void verifPlaceColonne4(){
        if (colonne4.emplacementColonneVidePrecis(4).equals("20")||colonne4.emplacementColonneVidePrecis(4).equals("20")){
            buttonCol4.setEnabled(false);
        }
    }
    public void verifPlaceColonne5(){
        if (colonne5.emplacementColonneVidePrecis(4).equals("20")||colonne5.emplacementColonneVidePrecis(4).equals("20")){
            buttonCol5.setEnabled(false);
        }
    }
    public void verfieWinGeneral(){
        if (!verifWinLigne()  &&  !verifWinHauteur()  &&  !verifWinDiagonaleVersHauteurGauche()  &&  !verifWinDiagonaleVersHauteurDroite()){
            verifPlaceColonne1();
            verifPlaceColonne2();
            verifPlaceColonne3();
            verifPlaceColonne4();
            verifPlaceColonne5();
            tour();
        }
    }
    public boolean verifWinLigne(){
        for (int i=0;i<=colonne1.jeton.length-1;i++){
            if (colonne1.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne1.jeton[i].getTag().equals("jeton_Joueur_Deux") && colonne2.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne2.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&   colonne3.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i].getTag().equals("jeton_Joueur_Deux")){
                if (colonne1.jeton[i].getTag().equals(colonne2.jeton[i].getTag())&& colonne2.jeton[i].getTag().equals(colonne3.jeton[i].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }
            if (colonne4.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne4.jeton[i].getTag().equals("jeton_Joueur_Deux") && colonne2.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne2.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&   colonne3.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i].getTag().equals("jeton_Joueur_Deux")){
                if (colonne4.jeton[i].getTag().equals(colonne2.jeton[i].getTag())&& colonne2.jeton[i].getTag().equals(colonne3.jeton[i].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }
            if (colonne4.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne4.jeton[i].getTag().equals("jeton_Joueur_Deux") && colonne5.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne5.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&   colonne3.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i].getTag().equals("jeton_Joueur_Deux")){
                if (colonne4.jeton[i].getTag().equals(colonne5.jeton[i].getTag())&& colonne5.jeton[i].getTag().equals(colonne3.jeton[i].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }

        }
        return false;
    }
    public boolean verifWinHauteur(){
        for (Colonne colonne:tabDeColonne) {
            for (int i=0;i<=2;i++){
                if (colonne.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne.jeton[i].getTag().equals("jeton_Joueur_Deux") && colonne.jeton[i+1].getTag().equals("jeton_Joueur_Un") | colonne.jeton[i+1].getTag().equals("jeton_Joueur_Deux")&& colonne.jeton[i+2].getTag().equals("jeton_Joueur_Un") | colonne.jeton[i+2].getTag().equals("jeton_Joueur_Deux")){
                    if (colonne.jeton[i].getTag().equals(colonne.jeton[i+1].getTag())&& colonne.jeton[i+1].getTag().equals(colonne.jeton[i+2].getTag())){
                        if (tourDe==1){
                            aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                            disableAllBouttonAndActiveResetButton();
                            return true;
                        }else if (tourDe==2){
                            aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                            disableAllBouttonAndActiveResetButton();
                            return true;
                        }
                    }
                }
            }

        }
        return false;
    }
    public boolean verifWinDiagonaleVersHauteurDroite(){
        for(int i=0;i<=2;i++){
            if (colonne3.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&  colonne4.jeton[i+1].getTag().equals("jeton_Joueur_Un") | colonne4.jeton[i+1].getTag().equals("jeton_Joueur_Deux") && colonne5.jeton[i+2].getTag().equals("jeton_Joueur_Un") | colonne5.jeton[i+2].getTag().equals("jeton_Joueur_Deux")){
                if (colonne3.jeton[i].getTag().equals(colonne4.jeton[i+1].getTag())&& colonne4.jeton[i+1].getTag().equals(colonne5.jeton[i+2].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }
            if (colonne1.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne1.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&  colonne2.jeton[i+1].getTag().equals("jeton_Joueur_Un") | colonne2.jeton[i+1].getTag().equals("jeton_Joueur_Deux") && colonne3.jeton[i+2].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i+2].getTag().equals("jeton_Joueur_Deux")){
                if (colonne1.jeton[i].getTag().equals(colonne2.jeton[i+1].getTag())&& colonne2.jeton[i+1].getTag().equals(colonne3.jeton[i+2].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }
            if (colonne2.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne2.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&  colonne3.jeton[i+1].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i+1].getTag().equals("jeton_Joueur_Deux") && colonne4.jeton[i+2].getTag().equals("jeton_Joueur_Un") | colonne4.jeton[i+2].getTag().equals("jeton_Joueur_Deux")){
                if (colonne2.jeton[i].getTag().equals(colonne3.jeton[i+1].getTag())&& colonne3.jeton[i+1].getTag().equals(colonne4.jeton[i+2].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean verifWinDiagonaleVersHauteurGauche(){
        for(int i=0;i<=2;i++){
            if (colonne3.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&  colonne2.jeton[i+1].getTag().equals("jeton_Joueur_Un") | colonne2.jeton[i+1].getTag().equals("jeton_Joueur_Deux") && colonne1.jeton[i+2].getTag().equals("jeton_Joueur_Un") | colonne1.jeton[i+2].getTag().equals("jeton_Joueur_Deux")){
                if (colonne3.jeton[i].getTag().equals(colonne2.jeton[i+1].getTag())&& colonne2.jeton[i+1].getTag().equals(colonne1.jeton[i+2].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }
            if (colonne4.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne4.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&  colonne3.jeton[i+1].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i+1].getTag().equals("jeton_Joueur_Deux") && colonne2.jeton[i+2].getTag().equals("jeton_Joueur_Un") | colonne2.jeton[i+2].getTag().equals("jeton_Joueur_Deux")){
                if (colonne4.jeton[i].getTag().equals(colonne3.jeton[i+1].getTag())&& colonne3.jeton[i+1].getTag().equals(colonne2.jeton[i+2].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }
            if (colonne5.jeton[i].getTag().equals("jeton_Joueur_Un") | colonne5.jeton[i].getTag().equals("jeton_Joueur_Deux")  &&  colonne4.jeton[i+1].getTag().equals("jeton_Joueur_Un") | colonne4.jeton[i+1].getTag().equals("jeton_Joueur_Deux") && colonne3.jeton[i+2].getTag().equals("jeton_Joueur_Un") | colonne3.jeton[i+2].getTag().equals("jeton_Joueur_Deux")){
                if (colonne5.jeton[i].getTag().equals(colonne4.jeton[i+1].getTag())&& colonne4.jeton[i+1].getTag().equals(colonne3.jeton[i+2].getTag())){
                    if (tourDe==1){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur1));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }else if (tourDe==2){
                        aQui.setText(String.format("félicitations %s vous avez gagné", joueur2));
                        disableAllBouttonAndActiveResetButton();
                        return true;
                    }
                }
            }
        }
        return false;
    }




    public void disableAllBouttonAndActiveResetButton(){
        buttonCol1.setEnabled(false);
        buttonCol2.setEnabled(false);
        buttonCol3.setEnabled(false);
        buttonCol4.setEnabled(false);
        buttonCol5.setEnabled(false);
        buttonFin.setEnabled(true);
    }
}

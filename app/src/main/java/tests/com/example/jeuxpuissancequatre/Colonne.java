package tests.com.example.jeuxpuissancequatre;

import android.widget.ImageView;

public class Colonne {
    ImageView[] jeton;

    Colonne(ImageView[] jeton) {
        this.jeton = jeton;
    }
    String ajouterJeton(int aQuitour){
        String resultat=emplacementColonneVide();
        if (resultat.equals("Pas de case vide")){
            return resultat;
        }else{
            int emplacement =Integer.parseInt(resultat);
            int colonneMax=0;
            if (aQuitour==1){
                jeton[emplacement].setImageResource(R.drawable.jeton_jaune);
                jeton[emplacement].setTag("jeton_Joueur_Un");
                if (emplacement ==4){
                    colonneMax++;
                }
            }else if (aQuitour==2){
                jeton[emplacement].setImageResource(R.drawable.jeton_rouge);
                jeton[emplacement].setTag("jeton_Joueur_Deux");
                if (emplacement ==4){
                    colonneMax++;
                }

            }
            return Integer.toString(colonneMax);
        }
    }
    String emplacementColonneVide(){
        for (int i = 0; i<=jeton.length-1; i++){
            if (jeton[i].getTag().equals("jeton_noire")){
                return Integer.toString(i);
            }
        }
        return "Pas de case vide";

    }
    String emplacementColonneVidePrecis(int emplecement){
        for (int i = 0; i<=jeton.length-1; i++){
            if (jeton[emplecement].getTag().equals("jeton_Joueur_Un")||jeton[emplecement].getTag().equals("jeton_Joueur_Deux")){
                return "20";
            }
        }
        return "Pas de case vide";

    }
}

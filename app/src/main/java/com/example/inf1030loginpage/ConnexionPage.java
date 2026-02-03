package com.example.inf1030loginpage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.frag.LogIn;
import com.example.inf1030loginpage.frag.Reset;
import com.example.inf1030loginpage.frag.SignIn;

public class ConnexionPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //pour afficher par defaut le fragment de connexion dans le conteneur
        if ( savedInstanceState == null ){
            switchFragment(new LogIn());
        }

        //  Ici tu dis à l'activité : "utilise ce fichier XML comme écran"
        setContentView(R.layout.activity_connexion_page);

        //Ici on recupère les vues du layout ( ça peut etre des boutons dans ce cas on va recuperer des instances de Button
        TextView connexion = findViewById(R.id.connexion);
        TextView reset = findViewById(R.id.reset);
        TextView signIn = findViewById(R.id.signIn);


        // Quand on clique sur "reset", on change le fragment affiché
        reset.setOnClickListener(v -> {
            switchFragment(new Reset());
        });

        //  Quand on clique sur "connexion", on affiche le fragment LogIn
        connexion.setOnClickListener( v -> {
            switchFragment( new LogIn());
        } );

        //  Quand on clique sur "signIn", on affiche le fragment SignIn
        signIn.setOnClickListener( v -> {
            switchFragment( new SignIn());
        } );

    }


    /**
     * Methode qui remplace le fragment actuellement affiché dans le conteneur "fragment"
     * @param fragment represente le fragment a remplacer
     */
    public  void switchFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment, fragment)           //remplace le contenu du conteneur FragmentContenairView
                .commit();                                  //applique les changement

    }
}
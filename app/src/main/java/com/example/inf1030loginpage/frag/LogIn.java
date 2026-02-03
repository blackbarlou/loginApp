package com.example.inf1030loginpage.frag;

import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.R;


/**
 * Cette classe gerer le fragment de la vue de connexion
 */
public class LogIn extends Fragment {

    public LogIn() {
        // Required empty public constructor
    }

    /**
     *
     * @param inflater The LayoutInflater object that can be used to inflate
     * any views in the fragment,
     * @param container If non-null, this is the parent view that the fragment's
     * UI should be attached to.  The fragment should not add the view itself,
     * but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     * from a previous saved state as given here.
     *
     *LayoutInflater est un objet qui :transforme un fichier XML en objets Java View
     *container : C’est le parent dans lequel le fragment va être placé
     * false : très important Ça veut dire NE PAS attacher la View au container tout de suite
     *         pourquoi ? Parce que Android va s’en charger automatiquement après, Si tu mets true →  crash (IllegalStateException)
     *
     * @return
     */
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.log_in_fragment, container, false);
    }


}
package com.example.inf1030loginpage.connexionFrag;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;

import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.PagePrincipale;
import com.example.inf1030loginpage.R;
import com.example.inf1030loginpage.databinding.SignInFragmentBinding;


/**
 * Cette classe gerer le fragment de la vue de connexion
 */
public class SingInFrag extends Fragment {
    private SignInFragmentBinding binder;

    public SingInFrag() {
        // Required empty public constructor
    }

    /**
     * @param inflater           The LayoutInflater object that can be used to inflate
     *                           any views in the fragment,
     * @param container          If non-null, this is the parent view that the fragment's
     *                           UI should be attached to.  The fragment should not add the view itself,
     *                           but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     *                           from a previous saved state as given here.
     *                           <p>
     *                           LayoutInflater est un objet qui :transforme un fichier XML en objets Java View
     *                           container : C’est le parent dans lequel le fragment va être placé
     *                           false : très important Ça veut dire NE PAS attacher la View au container tout de suite
     *                           pourquoi ? Parce que Android va s’en charger automatiquement après, Si tu mets true →  crash (IllegalStateException)
     * @return
     */
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        binder = SignInFragmentBinding.inflate(inflater, container, false);

        binder.confirmButton.setOnClickListener(v -> {
            Intent next = new Intent(requireActivity(), PagePrincipale.class);
            startActivity(next);
            requireActivity().finish();

        });
        return  binder.getRoot();
    }



}
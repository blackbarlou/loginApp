package com.example.inf1030loginpage.frag;

import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.R;


public class LogIn extends Fragment {


    EditText etUsername, etPassword, pageConnexion;
    Button button;

    public LogIn() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.log_in_fragment, container, false);
    }

    /*public void onViewCreated (@NonNull View view, Bundle savedInstanceState ){
        super.onViewCreated(view, savedInstanceState);

        etUsername = view.findViewById(R.id.username);

    }*/


}
package com.example.inf1030loginpage.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.R;

public class SignIn extends Fragment {

    public SignIn (){

    }
    public View onCreateView (LayoutInflater inflater,
                              ViewGroup container,
                              Bundle saveInstanceState){
        return inflater.inflate(R.layout.sign_in_fragment, container, false );
    }

}

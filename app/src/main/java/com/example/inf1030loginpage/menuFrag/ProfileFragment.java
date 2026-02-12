package com.example.inf1030loginpage.menuFrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.R;

public class ProfileFragment extends Fragment {

    public ProfileFragment(){

    }
    public View onCreateView (LayoutInflater inflater,
                              ViewGroup container,
                              Bundle saveInstanceState ){
        return inflater.inflate(R.layout.profile_frag,
                container,
                false);
    }


}

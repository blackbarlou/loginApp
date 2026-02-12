package com.example.inf1030loginpage.menuFrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.MyAdaptater;
import com.example.inf1030loginpage.R;
import com.example.inf1030loginpage.databinding.FavorisFragBinding;

public class FavFragment extends Fragment {

    FavorisFragBinding binder;
    MyAdaptater adaptater;
    public FavFragment(){

    }

    public View onCreateView (@NonNull LayoutInflater inflater,
                              ViewGroup container,
                              Bundle saveInstanceState ){
        binder = FavorisFragBinding.inflate( inflater,
                container,
                false );
        return binder.getRoot();
    }
}

package com.example.inf1030loginpage.menuFrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.MyAdaptater;
import com.example.inf1030loginpage.R;
import com.example.inf1030loginpage.StudentDTO;
import com.example.inf1030loginpage.databinding.ListFragBinding;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    private ListFragBinding binder;

    public ListFragment(){

    }
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle saveInstanceState){
        binder = ListFragBinding.inflate( inflater,
                container,
                false );

        return binder.getRoot();
    }

    public void onViewCreated (@NonNull View view, Bundle saveInstanceSate ){
        super.onViewCreated(view, saveInstanceSate);

        MyAdaptater adaptater = new MyAdaptater(requireContext());

        binder.list.setAdapter(adaptater);

        List<StudentDTO> data = new ArrayList<>();

        data.add( new StudentDTO("NURUDEEN", "Abiola", "NURA25349801") );
        data.add( new StudentDTO("NURUDEEN II", "Jean", "NUJE25349801") );
        data.add( new StudentDTO("NURUDEEN III", "Pierre", "NUPI25349801") );
        data.add( new StudentDTO("NURUDEEN IV", "Philipp", "NUPH25349801") );
        adaptater.setData(data);
    }
}

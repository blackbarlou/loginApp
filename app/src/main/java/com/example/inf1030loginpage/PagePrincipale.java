package com.example.inf1030loginpage;

import android.os.Binder;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.inf1030loginpage.databinding.ActivityPagePrincipaleBinding;
import com.example.inf1030loginpage.menuFrag.FavFragment;
import com.example.inf1030loginpage.menuFrag.ListFragment;
import com.example.inf1030loginpage.menuFrag.ProfileFragment;

public class PagePrincipale extends AppCompatActivity {


    private ActivityPagePrincipaleBinding binder;

    /**
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate (savedInstanceState );

        binder = DataBindingUtil.
                setContentView( this, R.layout.activity_page_principale );

        binder.bottomNaviagtion.setOnItemSelectedListener( menuItem -> {
            if ( menuItem.getItemId() == R.id.favoris ){
                push ( new FavFragment());
            }
            if ( menuItem.getItemId() == R.id.list ){
                push ( new ListFragment());
            }
            if ( menuItem.getItemId() == R.id.profile ){
                push ( new ProfileFragment());
            }
            return false;
        } );
        push ( new ListFragment() );
    }

    private void push(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)           //remplace le contenu du conteneur FragmentContenairView
                .commit();                                  //applique les changement

    }
}
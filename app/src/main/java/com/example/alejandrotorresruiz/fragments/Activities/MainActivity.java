package com.example.alejandrotorresruiz.fragments.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.alejandrotorresruiz.fragments.Fragments.DataFragment;
import com.example.alejandrotorresruiz.fragments.Fragments.DetailsFragment;
import com.example.alejandrotorresruiz.fragments.R;

public class MainActivity extends FragmentActivity implements DataFragment.Datalistener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String texto) {
        //Recogemos el fragment.
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.data_details);
        detailsFragment.renderizarTexto(texto);
    }
}

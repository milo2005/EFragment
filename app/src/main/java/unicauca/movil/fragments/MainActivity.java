package unicauca.movil.fragments;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unicauca.movil.fragments.fragments.ColorFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        putFragment(R.id.container1, ColorFragment.instance(ColorFragment.VERDE));

        putFragment(R.id.container2, ColorFragment.instance(ColorFragment.NARANJA));
    }

    void putFragment(@IdRes int contenedor, Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(contenedor, fragment);
        ft.commit();
    }
}

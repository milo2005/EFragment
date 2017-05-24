package unicauca.movil.fragments;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.fragments.adapters.ColorAdapter;
import unicauca.movil.fragments.databinding.ActivityTabsBinding;
import unicauca.movil.fragments.fragments.ColorFragment;

public class TabsActivity extends AppCompatActivity {

    ActivityTabsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tabs);

        List<Fragment> pages =  new ArrayList<>();
        pages.add(ColorFragment.instance(ColorFragment.AZUL));
        pages.add(ColorFragment.instance(ColorFragment.AMARILLO));
        pages.add(ColorFragment.instance(ColorFragment.ROJO));
        pages.add(ColorFragment.instance(ColorFragment.VERDE));
        pages.add(ColorFragment.instance(ColorFragment.NARANJA));
        pages.add(ColorFragment.instance(ColorFragment.VIOLETA));

        ColorAdapter adapter =  new ColorAdapter(getSupportFragmentManager(), pages);
        binding.pager.setAdapter(adapter);

        setSupportActionBar(binding.toolbar);
        binding.tabs.setupWithViewPager(binding.pager);
    }
}

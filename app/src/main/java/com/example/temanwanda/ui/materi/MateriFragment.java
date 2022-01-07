package com.example.temanwanda.ui.materi;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.temanwanda.MathActivity;
import com.example.temanwanda.R;
import com.example.temanwanda.ui.eng.EnglishFragment;
import com.example.temanwanda.ui.his.HisFragment;
import com.example.temanwanda.ui.kom.KomFragment;
import com.example.temanwanda.ui.math.MathFragment;


public class MateriFragment extends Fragment {

    Button b4;
    Button b5;
    Button b6;
    Button b7;

    public View onCreateView(@NonNull LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_materi, container, false);

        b4 = v.findViewById(R.id.button4);
        b5 = v.findViewById(R.id.button5);
        b6 = v.findViewById(R.id.button6);
        b7 = v.findViewById(R.id.button7);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment,new MathFragment());
                fr.commit();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment,new EnglishFragment());
                fr.commit();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment,new KomFragment());
                fr.commit();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment,new HisFragment());
                fr.commit();

            }
        });

        return v;
    }

}

package com.example.temanwanda.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.temanwanda.R;
import com.example.temanwanda.ui.akun.AkunFragment;
import com.example.temanwanda.ui.materi.MateriFragment;

public class HomeFragment extends Fragment {

    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        b1 = v.findViewById(R.id.imagebutton1);
        b2 = v.findViewById(R.id.imagebutton2);
        b3 = v.findViewById(R.id.imagebutton3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment,new MateriFragment());
                fr.commit();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.nav_host_fragment,new AkunFragment());
                fr.commit();

            }
        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                FragmentTransaction fr = getFragmentManager().beginTransaction();
//                fr.replace(R.id.nav_host_fragment,new CitiesFragment());
//                fr.commit();
//
//
//
//            }
//        });

        return v;
    }
}

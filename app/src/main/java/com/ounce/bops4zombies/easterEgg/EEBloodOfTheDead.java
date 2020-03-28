package com.ounce.bops4zombies.easterEgg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ounce.bops4zombies.Images;
import com.ounce.bops4zombies.R;
import com.ounce.bops4zombies.TextActivity;

import java.util.ArrayList;

public class EEBloodOfTheDead extends AppCompatActivity {

    ArrayList<Integer> aves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeblood_of_the_dead);
        aves = new ArrayList<>();
        int img_ee_ee_blood_of_the_dead_birth;
        for (int i = 0; i <41 ; i++) {



        }
        aves.add(R.raw.ee_blood_of_the_dead_birth_1);
        aves.add(R.raw.ee_blood_of_the_dead_birth_2);
        aves.add(R.raw.ee_blood_of_the_dead_birth_3);
        aves.add(R.raw.ee_blood_of_the_dead_birth_4);
        aves.add(R.raw.ee_blood_of_the_dead_birth_5);
        aves.add(R.raw.ee_blood_of_the_dead_birth_6);
        aves.add(R.raw.ee_blood_of_the_dead_birth_7);
        aves.add(R.raw.ee_blood_of_the_dead_birth_8);
        aves.add(R.raw.ee_blood_of_the_dead_birth_9);
        aves.add(R.raw.ee_blood_of_the_dead_birth_10);
        aves.add(R.raw.ee_blood_of_the_dead_birth_11);
        aves.add(R.raw.ee_blood_of_the_dead_birth_12);
        aves.add(R.raw.ee_blood_of_the_dead_birth_13);
        aves.add(R.raw.ee_blood_of_the_dead_birth_14);
        aves.add(R.raw.ee_blood_of_the_dead_birth_15);
        aves.add(R.raw.ee_blood_of_the_dead_birth_16);
        aves.add(R.raw.ee_blood_of_the_dead_birth_17);
        aves.add(R.raw.ee_blood_of_the_dead_birth_18);
        aves.add(R.raw.ee_blood_of_the_dead_birth_19);
        aves.add(R.raw.ee_blood_of_the_dead_birth_20);
        aves.add(R.raw.ee_blood_of_the_dead_birth_21);
        aves.add(R.raw.ee_blood_of_the_dead_birth_22);
        aves.add(R.raw.ee_blood_of_the_dead_birth_23);
        aves.add(R.raw.ee_blood_of_the_dead_birth_24);
        aves.add(R.raw.ee_blood_of_the_dead_birth_25);
        aves.add(R.raw.ee_blood_of_the_dead_birth_26);
        aves.add(R.raw.ee_blood_of_the_dead_birth_27);
        aves.add(R.raw.ee_blood_of_the_dead_birth_28);
        aves.add(R.raw.ee_blood_of_the_dead_birth_29);
        aves.add(R.raw.ee_blood_of_the_dead_birth_30);
        aves.add(R.raw.ee_blood_of_the_dead_birth_31);
        aves.add(R.raw.ee_blood_of_the_dead_birth_32);
        aves.add(R.raw.ee_blood_of_the_dead_birth_33);
        aves.add(R.raw.ee_blood_of_the_dead_birth_34);
        aves.add(R.raw.ee_blood_of_the_dead_birth_35);
        aves.add(R.raw.ee_blood_of_the_dead_birth_36);
        aves.add(R.raw.ee_blood_of_the_dead_birth_37);
        aves.add(R.raw.ee_blood_of_the_dead_birth_38);
        aves.add(R.raw.ee_blood_of_the_dead_birth_39);
        aves.add(R.raw.ee_blood_of_the_dead_birth_40);
        aves.add(R.raw.ee_blood_of_the_dead_birth_41);

        Button btPaso1= findViewById(R.id.eebotdpaso1);
        btPaso1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), TextActivity.class);
                intent.putExtra("key", "eeBloodOfTheDeadPaso1");
                startActivityForResult(intent, 0);
            }
        });

        Button btGaviotas= findViewById(R.id.eebotdpaso4);
        btGaviotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Images.class);
                intent.putExtra("key", aves);
                startActivityForResult(intent, 0);
            }
        });



    }
}

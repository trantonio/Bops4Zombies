package com.ounce.bops4zombies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.ounce.bops4zombies.maps.Mapa;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TextActivity extends AppCompatActivity {
    private List<Mapa> mapas;
    private ArrayList<String> pasos;
    private String argIntent;
    private TextView texoAescribir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);


        loadData();
        argIntent = getIntent().getStringExtra("key");
        switch (argIntent){

            case "eeBloodOfTheDeadPaso1":
                Toast toast = Toast.makeText(this, getIntent().getStringExtra("key")+"", Toast.LENGTH_SHORT);
                toast.show();
                texoAescribir= findViewById(R.id.tvExplicaicon);
//                texoAescribir.setText("Cambiar el texto por el del paso 1");
                texoAescribir.setText("Cambiar el texto por el del paso 1");
                break;
            default:

                break;

        }
    }
    private void loadData() {
        mapas = new ArrayList<>();
        try {

            JSONObject obj = new JSONObject(loadJSONFromAsset("maps.json"));
            JSONArray jsonArray = obj.getJSONArray("mapa");

            for (int i = 0; i <jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                for (int j = 0; j < 10; j++) {
                    pasos.add(jsonObject.getString("paso"+j));
                }
                mapas.add(new Mapa(jsonObject.getString("name"), jsonObject.getString("shield"),
                        jsonObject.getString("specialweapon"),pasos));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return;
    }
    public String loadJSONFromAsset(String path) {
        String json = null;
        try {
            InputStream is = getAssets().open(path);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}

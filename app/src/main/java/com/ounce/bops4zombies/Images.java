package com.ounce.bops4zombies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Images extends AppCompatActivity {
    private RecyclerView rv;
    private List<Image> images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        rv =  findViewById(R.id.image_recycler_View);
        rv.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        rv.setLayoutManager(gridLayoutManager);

        //TODO load images into array.
        images = new ArrayList<>();
        ArrayList<Integer> imageslist = (ArrayList<Integer>) getIntent().getSerializableExtra("key");
        for (int i = 0; i <imageslist.size(); i++) {
            images.add(new Image(imageslist.get(i)));
        }
        Toast toast = Toast.makeText(this, imageslist.size()+"", Toast.LENGTH_SHORT);
        toast.show();
        //initializeData();

        MyAdapter myAdapter = new MyAdapter(images);
        rv.setAdapter(myAdapter);
    }

    private void initializeData() {
        images = new ArrayList<>();
        for (int i = 0; i <100; i++) {
            images.add(new Image(R.raw.shield_blood_of_the_dead_1));
        }
    }
//
//    class Image {
//        int photoId;
//
//        public Image(int photoId) {
//            this.photoId = photoId;
//        }
//    }
}

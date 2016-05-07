package com.natidze.irakli.assign2;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.natidze.irakli.assign2.adapters.TestAdapter;
import com.natidze.irakli.assign2.model.PlayerModel;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PlayerModel> list = new ArrayList<>();

            for (int i = 0; i < Players.names.length; i++) {
                PlayerModel model = new PlayerModel(Players.names[i], Players.images[i], Players.descreption[i]);
                list.add(model);
            }

        TestAdapter adapter = new TestAdapter(this,list);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //PlayerModel clickPlayer = (PlayerModel) parent.getAdapter().getItem(position);
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                intent.putExtra("player", (PlayerModel) parent.getAdapter().getItem(position));

                startActivity(intent);
            }
        });
    }



}

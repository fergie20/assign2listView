package com.natidze.irakli.assign2.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.natidze.irakli.assign2.MainActivity;
import com.natidze.irakli.assign2.Players;
import com.natidze.irakli.assign2.R;
import com.natidze.irakli.assign2.ViewHolder;
import com.natidze.irakli.assign2.model.PlayerModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Irakli on 01.05.2016.
 */
public class TestAdapter extends BaseAdapter {

    private ArrayList<PlayerModel> list;
    private Context context;

    public TestAdapter(MainActivity context, ArrayList<PlayerModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView;
        ViewHolder viewHolder;

        if (convertView == null){
            listItemView = View.inflate(context, R.layout.list_item_view, null);

            TextView textView = (TextView) listItemView.findViewById(R.id.textView);
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);

            viewHolder = new ViewHolder();
            viewHolder.nameField = textView;
            viewHolder.imageField = imageView;

            listItemView.setTag(viewHolder);
        }else {
            listItemView = convertView;
            viewHolder = (ViewHolder) convertView.getTag();
        }


        PlayerModel player = (PlayerModel) getItem(position);

        Picasso.with(context).load(player.getImage()).resize(80,80).centerCrop().into(viewHolder.imageField);
        viewHolder.nameField.setText(player.getName());

        return listItemView;
    }

}

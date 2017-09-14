package com.example.co_recyclerview.activity.activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.co_recyclerview.R;
import com.example.co_recyclerview.activity.activity.activity.MainActivity;
import com.example.co_recyclerview.activity.activity.model.AndroidVersion;

import java.util.ArrayList;

/**
 * Created by Patrick Ian Co on 9/14/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.AndroidViewHolder> {
    ArrayList<AndroidVersion> androidVersion;

    public CustomAdapter(ArrayList<AndroidVersion> androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_layout, parent, false);

        AndroidViewHolder androidViewHolder = new AndroidViewHolder(view);

        return androidViewHolder;
    }

    @Override
    public void onBindViewHolder(AndroidViewHolder holder, int i) {
        final AndroidVersion version = androidVersion.get(i);
        holder.logo.setImageResource(version.getLogo());
        holder.codename.setText(version.getCodename());
        holder.version.setText(version.getVersion());
        holder.api.setText(version.getApi());
        holder.released_date.setText(version.getReleased_date());
    }

    @Override
    public int getItemCount() {
        return androidVersion.size();
    }

    public static class AndroidViewHolder extends RecyclerView.ViewHolder{

        ImageView logo;
        TextView codename;
        TextView version;
        TextView api;
        TextView released_date;


        public AndroidViewHolder(View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.logo);
            codename = itemView.findViewById(R.id.codename);
            version = itemView.findViewById(R.id.version);
            api = itemView.findViewById(R.id.api);
            released_date = itemView.findViewById(R.id.released_date);
        }

    }
}

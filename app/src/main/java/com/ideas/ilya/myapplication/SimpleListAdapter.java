package com.ideas.ilya.myapplication;

import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SimpleListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ArrayList<Pair<String, String>> items;

    public SimpleListAdapter(ArrayList<Pair<String, String>> items) {
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new SimpleViewHoler(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((SimpleViewHoler)holder).text1.setText(items.get(position).first);
        ((SimpleViewHoler)holder).text2.setText(items.get(position).second);
    }

    public static class SimpleViewHoler extends RecyclerView.ViewHolder {
        TextView text1;
        TextView text2;

        public SimpleViewHoler(View itemView) {
            super(itemView);
            text1 = (TextView) itemView.findViewById(R.id.text1);
            text2 = (TextView) itemView.findViewById(R.id.text2);
        }
    }
}


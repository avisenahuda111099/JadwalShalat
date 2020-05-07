package com.example.jadwalshalat.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jadwalshalat.R;
import com.example.jadwalshalat.model.sholat.Timings;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class SholatDiscoverAdapter extends RecyclerView.Adapter<SholatDiscoverAdapter.ViewHolder> {
    private ArrayList<Timings> timingsItems = new ArrayList<>();
    private Context context;

    public SholatDiscoverAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<Timings> items) {
        timingsItems    .clear();
        timingsItems.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SholatDiscoverAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SholatDiscoverAdapter.ViewHolder holder, int position) {
        //Glide.with(context).load()
        holder.subuh.setText(timingsItems.get(position).getFajr()+"");

    }

    @Override
    public int getItemCount() {
        return timingsItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView subuh, dzuhur, ashar, maghrib,isya;
        CardView cvItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem = itemView.findViewById(R.id.itemlist_cv);
            subuh = itemView.findViewById(R.id.itemlist_subuh);
            dzuhur = itemView.findViewById(R.id.itemlist_dzuhur);
            ashar=itemView.findViewById(R.id.itemlist_ashar);
            maghrib=itemView.findViewById(R.id.itemlist_maghrib);
            isya=itemView.findViewById(R.id.itemlist_isya);
        }
    }
}

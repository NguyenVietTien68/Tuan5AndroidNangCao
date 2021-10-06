package com.example.tuan5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private ArrayList<Songs> lSong;
    private OnClickListener onclick;

    public CustomAdapter(ArrayList<Songs> lSong, OnClickListener onclick) {
        this.lSong = lSong;
        this.onclick = onclick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public int getItemCount() {
        return lSong.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Songs songclick;
        TextView tenbh,tentg,thoigian;
        ImageButton imgAnh, anhPlay;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tenbh = itemView.findViewById(R.id.txt_name);
            tentg = itemView.findViewById(R.id.txt_author);
            thoigian = itemView.findViewById(R.id.txt_time);
            imgAnh = itemView.findViewById(R.id.anh);
            anhPlay = itemView.findViewById(R.id.btn_play);
            itemView.setOnClickListener(view->{

            });
            imgAnh.setOnClickListener(view->{
                onclick.clickbutton(songclick);
            });

        }
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Songs song = lSong.get(position);
        holder.songclick = song;
        holder.tenbh.setText(song.getTen());
        holder.tentg.setText(song.getTacgia());
        holder.thoigian.setText(song.getThoigian());
        holder.imgAnh.setImageResource(song.getHinh());

    }

}

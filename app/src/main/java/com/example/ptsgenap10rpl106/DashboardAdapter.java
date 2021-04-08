package com.example.ptsgenap10rpl106;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardHolder> {

    private ArrayList<SetterGetter> listData;

    public DashboardAdapter(ArrayList<SetterGetter> listData){
        this.listData = listData;
    }

    @NonNull
    @Override
    public DashboardAdapter.DashboardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_dashboard,parent,false);
        DashboardHolder holder = new DashboardHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardAdapter.DashboardHolder holder, int position) {

        final SetterGetter getData = listData.get(position);
        String tittleMenu = getData.getTittle();
        String tittleMenu2 = getData.getTittle2();
        String logoMenu = getData.getImg();

        holder.titleMenu.setText(tittleMenu);
        holder.titleMenu2.setText(tittleMenu2);
        if (logoMenu.equals("video")){
            holder.imgMenu.setImageResource(R.drawable.video);
        }else if (logoMenu.equals("group")){
            holder.imgMenu.setImageResource(R.drawable.group);
        }else if (logoMenu.equals("team")){
            holder.imgMenu.setImageResource(R.drawable.team);
        }else if (logoMenu.equals("game")){
            holder.imgMenu.setImageResource(R.drawable.game);
        }else if (logoMenu.equals("market")){
            holder.imgMenu.setImageResource(R.drawable.market);
        }else if (logoMenu.equals("acara")){
            holder.imgMenu.setImageResource(R.drawable.acara);
        }else if (logoMenu.equals("kenangan")){
            holder.imgMenu.setImageResource(R.drawable.kenangan);
        }else if (logoMenu.equals("bantuan")){
            holder.imgMenu.setImageResource(R.drawable.bantuan);
        }else if (logoMenu.equals("pengaturan")){
            holder.imgMenu.setImageResource(R.drawable.pengaturan);
        }else if (logoMenu.equals("keluar")){
            holder.imgMenu.setImageResource(R.drawable.keluar);
        }
    }

    @Override
    public int getItemCount() {

        return listData.size();
    }

    public class DashboardHolder extends RecyclerView.ViewHolder {

        TextView titleMenu, titleMenu2;
        ImageView imgMenu;

        public DashboardHolder(@NonNull View itemView) {
            super(itemView);

            titleMenu = itemView.findViewById(R.id.tittle);
            titleMenu2 = itemView.findViewById(R.id.tittle2);
            imgMenu = itemView.findViewById(R.id.team);
        }
    }


}

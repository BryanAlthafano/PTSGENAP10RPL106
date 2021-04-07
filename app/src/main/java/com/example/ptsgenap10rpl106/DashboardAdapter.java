package com.example.ptsgenap10rpl106;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        String tittleMenu = getData.getTitle();
        String logoMenu = getData.getImg();

        holder.titleMenu.setText(tittleMenu);
        if (logoMenu.equals("logoMenu1")){
            holder.imgMenu.setImageResource(R.drawable.video);
        }else if (logoMenu.equals("logoMenu2")){
            holder.imgMenu.setImageResource(R.drawable.group);
        }else if (logoMenu.equals("logoMenu3")){
            holder.imgMenu.setImageResource(R.drawable.team);
        }else if (logoMenu.equals("logoMenu4")){
            holder.imgMenu.setImageResource(R.drawable.game);
        }else if (logoMenu.equals("logoMenu5")){
            holder.imgMenu.setImageResource(R.drawable.market);
        }else if (logoMenu.equals("logoMenu6")){
            holder.imgMenu.setImageResource(R.drawable.acara);
        }else if (logoMenu.equals("logoMenu7")){
            holder.imgMenu.setImageResource(R.drawable.kenangan);
        }else if (logoMenu.equals("logoMenu8")){
            holder.imgMenu.setImageResource(R.drawable.bantuan);
        }else if (logoMenu.equals("logoMenu9")){
            holder.imgMenu.setImageResource(R.drawable.pengaturan);
        }else if (logoMenu.equals("logoMenu10")){
            holder.imgMenu.setImageResource(R.drawable.keluar);
        }


    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class DashboardHolder extends RecyclerView.ViewHolder {

        TextView titleMenu;
        ImageView imgMenu;

        public DashboardHolder(@NonNull View itemView) {
            super(itemView);

            titleMenu = itemView.findViewById(R.id.tittle);
            imgMenu = itemView.findViewById(R.id.team);
        }
    }
}

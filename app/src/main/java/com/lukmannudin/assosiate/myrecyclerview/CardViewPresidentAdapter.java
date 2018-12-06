package com.lukmannudin.assosiate.myrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewPresidentAdapter extends RecyclerView.Adapter<CardViewPresidentAdapter.CardViewViewHolder> {

    private ArrayList<President> listPresident;
    private Context context;


    public CardViewPresidentAdapter(Context context){
        this.context = context;
    }

    public ArrayList<President> getListPresident(){
        return listPresident;
    }

    public void setListPresident(ArrayList<President> listPresident){
        this.listPresident = listPresident;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName,tvRemarks;
        Button btnFavorite, btnDetail;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_president,parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        final President p = getListPresident().get(position);

        Glide.with(context)
                .load(p.getPhoto())
                .override(350,550)
                .into(holder.imgPhoto);
        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getYear());

        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context,"Favorite "+getListPresident().get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        }));

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
//                Toast.makeText(context, "Share "+getListPresident().get(position).getName(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context,detailFilm.class);
                intent.putExtra(Utils.FILM_NAME,p.getName());
                intent.putExtra(Utils.FILM_DESCRIPTION,p.getDescription());
                intent.putExtra(Utils.PHOTO,p.getPhoto());
                intent.putExtra(Utils.YEAR,p.getYear());
                context.getApplicationContext().startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }


}

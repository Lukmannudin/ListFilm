package com.lukmannudin.assosiate.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Film> listFilm;

    public ListFilmAdapter(Context context){
        this.context = context;
    }

    public ArrayList<Film> getListFilm(){
        return listFilm;
    }

    public void setListFilm(ArrayList<Film> listFilm){
        this.listFilm = listFilm;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder  {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks  = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_president, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.tvName.setText(getListFilm().get(position).getName());
        holder.tvRemarks.setText(getListFilm().get(position).getYear());

        Glide.with(context)
            .load(getListFilm().get(position).getPhoto())
                .override(55,55)
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListFilm().size();
    }


}

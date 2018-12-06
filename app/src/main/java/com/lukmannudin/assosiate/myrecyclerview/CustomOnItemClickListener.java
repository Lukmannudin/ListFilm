package com.lukmannudin.assosiate.myrecyclerview;

import android.view.View;

public class CustomOnItemClickListener implements View.OnClickListener {

    public interface OnItemClickCallback{
        void onItemClicked(View view,int position);
    }

    private int position;
    private OnItemClickCallback onItemClickCallback;

    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback){
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view,position);
    }


}

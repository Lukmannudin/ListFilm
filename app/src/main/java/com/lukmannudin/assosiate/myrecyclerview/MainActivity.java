package com.lukmannudin.assosiate.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<President> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle("Mode List");
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(PresidentData.getListData());
        showRecyclerCardView();
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewPresidentAdapter cardViewPresidentAdapter = new CardViewPresidentAdapter(this);
        cardViewPresidentAdapter.setListPresident(list);
        rvCategory.setAdapter(cardViewPresidentAdapter);


        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
//                showSelectedPresident(list.get(position));
                Intent intent = new Intent(getApplicationContext(),detailFilm.class);
                startActivity(intent);
            }
        });
    }

    private void showSelectedPresident(President president){
        Toast.makeText(this,"Kamu memilih "+president.getName(), Toast.LENGTH_SHORT).show();
    }

}

package com.example.recyclerviewmvp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewmvp.R;
import com.example.recyclerviewmvp.presenter.Presenter;

public class RecyclerActivity extends AppCompatActivity {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        presenter = new Presenter();
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view_activity);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapterRecycler myAdapterRecycler = new MyAdapterRecycler(presenter.getRecyclerPresenter());
        recyclerView.setAdapter(myAdapterRecycler);
    }
}

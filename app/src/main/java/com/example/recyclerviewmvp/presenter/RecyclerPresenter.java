package com.example.recyclerviewmvp.presenter;

import com.example.recyclerviewmvp.model.RecyclerModel;
import com.example.recyclerviewmvp.view.IViewHolder;

import java.util.List;

public class RecyclerPresenter implements IRecyclerPresenter {

    private RecyclerModel recyclerModel= new RecyclerModel();
    private List<String> list = recyclerModel.getList();


    @Override
    public void bindView(IViewHolder iViewHolder) {
        iViewHolder.setText(list.get(iViewHolder.getPos()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

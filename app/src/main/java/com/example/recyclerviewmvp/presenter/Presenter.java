package com.example.recyclerviewmvp.presenter;

import com.example.recyclerviewmvp.model.RecyclerModel;
import com.example.recyclerviewmvp.view.IViewHolder;

import java.util.List;

public class Presenter {

    //часть логики ViewHolder вынесенная из адаптера RecyclerView в основной Presenter,
    // для возможности работать с паттерном MVP и RecyclerView
    RecyclerPresenter recyclerPresenter = new RecyclerPresenter();

    private class RecyclerPresenter implements IRecyclerPresenter {

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

    public RecyclerPresenter getRecyclerPresenter() {
        return recyclerPresenter;
    }
}

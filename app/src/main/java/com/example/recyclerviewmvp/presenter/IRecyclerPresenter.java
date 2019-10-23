package com.example.recyclerviewmvp.presenter;

import com.example.recyclerviewmvp.view.IViewHolder;

public interface IRecyclerPresenter {
    void bindView(IViewHolder iViewHolder);
    int getItemCount();
}

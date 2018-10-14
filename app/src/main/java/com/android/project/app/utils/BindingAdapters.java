package com.android.project.app.utils;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import com.android.project.app.utils.rv.BaseListItem;
import com.android.project.app.utils.rv.SimpleBindingAdapter;

import java.util.List;

public final class BindingAdapters {

    private BindingAdapters(){

    }

    @BindingAdapter({"list"})
    public static void bindSearchList(RecyclerView recyclerView, List<BaseListItem> listItems){
        if (recyclerView.getAdapter() == null){
            recyclerView.setAdapter(new SimpleBindingAdapter());
        }

        SimpleBindingAdapter simpleBindingAdapter = (SimpleBindingAdapter) recyclerView.getAdapter();
        simpleBindingAdapter.setItemList(listItems);
        simpleBindingAdapter.notifyDataSetChanged();
    }
}

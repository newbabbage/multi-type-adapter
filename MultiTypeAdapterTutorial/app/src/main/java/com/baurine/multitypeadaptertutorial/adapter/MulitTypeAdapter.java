package com.baurine.multitypeadaptertutorial.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baurine on 1/14/17.
 */

public class MulitTypeAdapter extends RecyclerView.Adapter {

    public interface IItem {
        // should directly return layout
        int getType();
    }

    private List<IItem> items = new ArrayList<>();

    ///////////////////////////////////////////////////////

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    ///////////////////////////////////////////////////////
    // operate items

    public List<IItem> getItems() {
        return items;
    }

    public void setItem(IItem item) {
        clearItems();
        addItem(item);
    }

    public void setItems(List<IItem> items) {
        clearItems();
        addItems(items);
    }

    public void addItem(IItem item) {
        items.add(item);
    }

    public void addItem(IItem item, int index) {
        items.add(index, item);
    }

    public void addItems(List<IItem> items) {
        this.items.addAll(items);
    }

    public void removeItem(IItem item) {
        items.remove(item);
    }

    public void clearItems() {
        items.clear();
    }
}
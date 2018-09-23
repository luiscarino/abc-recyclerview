package io.luiscarino.abcrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * A DelegateAdapter object acts as a bridge between a recycler view type and the
 * underlying data for that view. The Adapter provides access to the data item.
 * The Adapter is also responsible for creating the {@link android.support.v7.widget.RecyclerView.ViewHolder}
 * and and bind its data.
 *
 * @param <VH> The ViewHolder type
 * @param <T>  The RecyclerView type
 */
public interface DelegateAdapter<VH extends RecyclerView.ViewHolder, T extends RecyclerViewType> {

    VH onCreateViewHolder(ViewGroup viewGroup);

    void onBindViewHolder(VH viewHolder, T item);
}

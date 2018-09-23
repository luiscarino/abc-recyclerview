package io.luiscarino.abcrecyclerview
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * TODO: Use and remove java version
 */
interface KDelegateAdapter<VH : RecyclerView.ViewHolder, T : RecyclerViewType> {

    fun onCreateViewHolder(parent: ViewGroup): VH

    fun onBindViewHolder(holder: VH, item: T)
}

package com.demoforts.android.flickrpublicfeed.ui.publicfeed.databinding

import android.databinding.BindingAdapter
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.RecyclerView
import com.demoforts.android.flickrpublicfeed.domain.publicfeed.PublicFeedItem
import com.demoforts.android.flickrpublicfeed.ui.publicfeed.view.adapter.PublicFeedListAdapter
import com.demoforts.android.flickrpublicfeed.ui.publicfeed.viewmodel.PublicFeedListViewModel

/**
 * Created by Michal S. on 05.12.2017.
 * Bindings for Public Feed list activity
 */
@BindingAdapter("publicFeedList")
fun bindList(recyclerView: RecyclerView, items: List<PublicFeedItem>?) {
    if (items == null) {
        recyclerView.adapter = PublicFeedListAdapter(ArrayList(0), recyclerView.context)
    } else {
        recyclerView.adapter = PublicFeedListAdapter(items, recyclerView.context)
    }
}

@BindingAdapter("refreshBind")
fun bindRefreshAction(view: SwipeRefreshLayout, viewModel: PublicFeedListViewModel) {
    view.setOnRefreshListener({ viewModel.reloadData() })
}

@BindingAdapter("isLoadingBind")
fun bindLoadingState(view: SwipeRefreshLayout, isLoading: Boolean) {
    view.isRefreshing = isLoading
}





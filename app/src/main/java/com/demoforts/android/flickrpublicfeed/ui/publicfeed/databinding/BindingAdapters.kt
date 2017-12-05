package com.demoforts.android.flickrpublicfeed.ui.publicfeed.databinding

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.demoforts.android.flickrpublicfeed.domain.publicfeed.PublicFeedItem
import com.demoforts.android.flickrpublicfeed.ui.publicfeed.view.adapter.PublicFeedListAdapter

/**
 * Created by Michal S. on 05.12.2017.
 */
@BindingAdapter("publicFeedList")
fun bindList(recyclerView: RecyclerView, items: List<PublicFeedItem>?) {
    if(items==null) {
        recyclerView.adapter = PublicFeedListAdapter(ArrayList(0), recyclerView.context)
    } else {
        recyclerView.adapter = PublicFeedListAdapter(items, recyclerView.context)
    }
}
package com.demoforts.android.flickrpublicfeed.ui.publicfeed.databinding

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.demoforts.android.flickrpublicfeed.domain.publicfeed.PublicFeedItem
import com.demoforts.android.flickrpublicfeed.ui.publicfeed.view.adapter.PublicFeedListAdapter
import com.squareup.picasso.Picasso

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

@BindingAdapter("imageBind")
fun bindFlickrImage(imageView: ImageView, imageUrl: String) {
    Picasso.with(imageView.context).load(imageUrl).into(imageView)
}
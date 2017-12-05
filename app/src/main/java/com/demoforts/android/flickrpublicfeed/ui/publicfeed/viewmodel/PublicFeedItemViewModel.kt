package com.demoforts.android.flickrpublicfeed.ui.publicfeed.viewmodel

import android.databinding.ObservableField
import com.demoforts.android.flickrpublicfeed.domain.publicfeed.PublicFeedItem

/**
 * Created by Michal S. on 05.12.2017.
 */
class PublicFeedItemViewModel {
    val publicFeedItem = ObservableField<PublicFeedItem>()

    fun setItem(publicFeedItem: PublicFeedItem) {
        this.publicFeedItem.set(publicFeedItem)
    }
}